package dev.mnascimento0392.leetCode;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.java.Log;

@Log
public class GenerateSummaryHistory {

	CookieManager cookieManager;
	Builder requestBuilder;

	void getSummaryInfos() throws IOException, InterruptedException {
		CookieManager cookieManager = new CookieManager();
		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		CookieHandler.setDefault(cookieManager);
		HttpClient client = HttpClient.newBuilder().cookieHandler(CookieManager.getDefault()).build();
		String url = "https://leetcode.com/graphql/";

		BodyPublisher payload = BodyPublishers.ofString(query);
		HttpRequest request = HttpRequest.newBuilder().header("Accept", "*/*").header("authority", "leetcode.com")
				.header("Upgrade-Insecure-Requests", "1").header("scheme", "https")
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36")
				.uri(URI.create(url)).header("Content-Type", "application/json")
				.header("Referer", String.format("https://leetcode.com/u/%s/", UserPublicProfile.USER))
				.header("sec-fetch-site", "same-origin")
				.header("Set-Cookie",
						"csrftoken=z9r603Bm7ZKIBUwVUBGTGINjaaiutapufSErSGhfV7Encm0Cc2gwMRQcDEC8K6P5; expires=Sat, 05 Sep 2026 18:29:35 GMT; Max-Age=31449600; Path=/; SameSite=Lax; Secure")
				// .header("X-Csrftoken", "")
				.POST(payload).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String lastStatistic = ReadFile(Path.of("LastStatistic.json"));
		JSONObject data = new JSONObject(lastStatistic);
		UserPublicProfile lastUserProfile = new ObjectMapper().readValue(data.optJSONObject("data").toString(),
				UserPublicProfile.class);

		if (response.statusCode() == 200) {
			data = new JSONObject(response.body());
			UserPublicProfile user = new ObjectMapper().readValue(data.optJSONObject("data").toString(),
					UserPublicProfile.class);

			String type = questionType(user, lastUserProfile);
			int diffRanking = user.getMatchedUser().getProfile().ranking
					- lastUserProfile.getMatchedUser().getProfile().ranking;
			int diffContestRating = (int) (user.getUserContestRanking().getRating()
					- lastUserProfile.getUserContestRanking().getRating());
			int diffBadges = (user.getUserContestRanking().getBadge() == null ? 0 : 1)
					- ((lastUserProfile.getUserContestRanking().getBadge() == null ? 0 : 1));
			int diffCountAll = QuestionCount(user.getMatchedUser().getSubmitStats().getAcSubmissionNum(), "All")
					- QuestionCount(lastUserProfile.getMatchedUser().getSubmitStats().getAcSubmissionNum(), "All");
			// int diffCountType =
			// QuestionCount(user.getMatchedUser().getSubmitStats().getAcSubmissionNum(),
			// type)
			// -
			// QuestionCount(lastUserProfile.getMatchedUser().getSubmitStats().getAcSubmissionNum(),
			// type);
			BigDecimal diffBeats = user.getUserProfileUserQuestionProgressV2().getTotalQuestionBeatsPercentage()
					.subtract(lastUserProfile.getUserProfileUserQuestionProgressV2().getTotalQuestionBeatsPercentage());
			BigDecimal diffBeatsType = QuestionPrcentage(
					user.getUserProfileUserQuestionProgressV2().getUserSessionBeatsPercentage(), "Easy")
					.subtract(QuestionPrcentage(
							lastUserProfile.getUserProfileUserQuestionProgressV2().getUserSessionBeatsPercentage(),
							"Easy"));

			int diffSubmissions = QuestionSubmissions(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(),
					"All")
					- QuestionSubmissions(lastUserProfile.getMatchedUser().getSubmitStats().getTotalSubmissionNum(),
							"All");

			BigDecimal submissionsPercent = new BigDecimal(
					QuestionCount(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "All"))
					.multiply(new BigDecimal(100).divide(
							new BigDecimal(QuestionSubmissions(
									user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "All")),
							2, RoundingMode.CEILING));

			BigDecimal submissionsLastPercent = new BigDecimal(
					QuestionCount(lastUserProfile.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "All"))
					.multiply(new BigDecimal(100).divide(
							new BigDecimal(QuestionSubmissions(
									lastUserProfile.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "All")),
							2, RoundingMode.CEILING));
			BigDecimal diffSubmissionPercent = submissionsPercent.subtract(submissionsLastPercent);

			String statistic = String.format(template, UserPublicProfile.USER, LocalDate.now(),
					user.getMatchedUser().getProfile().getRanking(),
					(diffRanking > 0 ? ":small_red_triangle:" : (diffRanking < 0 ? ":small_red_triangle_down:" : "")),
					(diffRanking > 0 ? "**${\\\\large\\\\color{rec}" + diffRanking + "}$**"
							: ((diffRanking < 0 ? "**${\\\\large\\\\color{green}**" + diffRanking + "}$" : ""))),
					(int) Math.ceil(user.getUserContestRanking().getRating()),
					diffContestRating != 0 ? ":small_red_triangle: " + diffContestRating : "",
					user.getUserContestRanking().getBadge() == null ? 0
							: ":star2:" + user.getUserContestRanking().getBadge(),
					diffBadges != 0 ? diffBadges : " ", user.getUserContestRanking().getGlobalRanking(),
					user.getUserContestRanking().getTotalParticipants(),
					user.getUserContestRanking().getTopPercentage(),
					user.getUserContestRanking().getAttendedContestsCount(),
					type.equals("Easy") ? ":heavy_check_mark:" : "", type.equals("Medium") ? ":heavy_check_mark:" : "",
					type.equals("Hard") ? ":heavy_check_mark:" : "",
					QuestionCount(user.getMatchedUser().getSubmitStats().getAcSubmissionNum(), "All"),
					QuestionCount(user.getAllQuestionsCount(), "All"), diffCountAll,
					QuestionCount(user.getUserProfileUserQuestionProgressV2().getNumAcceptedQuestions(), "Easy"),
					QuestionCount(user.getAllQuestionsCount(), "Easy"),
					QuestionCount(user.getUserProfileUserQuestionProgressV2().getNumAcceptedQuestions(), "Medium"),
					QuestionCount(user.getAllQuestionsCount(), "Medium"),
					QuestionCount(user.getUserProfileUserQuestionProgressV2().getNumAcceptedQuestions(), "Hard"),
					QuestionCount(user.getAllQuestionsCount(), "Hard"),
					user.getUserProfileUserQuestionProgressV2().getTotalQuestionBeatsPercentage(),
					diffBeats.equals(new BigDecimal(0)) ? diffSubmissionPercent.toString() : "",
					diffBeatsType.equals(new BigDecimal(0)) ? diffSubmissionPercent.toString() : "",
					QuestionPrcentage(user.getUserProfileUserQuestionProgressV2().getUserSessionBeatsPercentage(),
							"Easy"),
					QuestionPrcentage(user.getUserProfileUserQuestionProgressV2().getUserSessionBeatsPercentage(),
							"Medium"),
					QuestionPrcentage(user.getUserProfileUserQuestionProgressV2().getUserSessionBeatsPercentage(),
							"Hard"),
					submissionsPercent,
					QuestionCount(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "All"),
					QuestionSubmissions(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "All"),
					diffSubmissionPercent.equals(new BigDecimal(0)) ? diffSubmissionPercent.toString() : "",
					diffSubmissions != 0 ? "(" + diffSubmissions + ")" : "",
					QuestionCount(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "Easy"),
					QuestionSubmissions(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "Easy"),
					QuestionCount(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "Medium"),
					QuestionSubmissions(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "Medium"),
					QuestionCount(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "Hard"),
					QuestionSubmissions(user.getMatchedUser().getSubmitStats().getTotalSubmissionNum(), "Hard"));

			OverwriteFile(Path.of("statistics.md"), statistic, 2);

			WriteFile(Path.of("LastStatistic.json"), response.body());

			log.info("Updated statistics.md\n");
		} else {
			log.info(String.valueOf(response.statusCode()));
		}

	}

	private final String query = String.format(
			"""
					{
					"query": "query userPublicProfile($username: String!) {userContestRanking(username: $username) {    attendedContestsCount    rating    globalRanking    totalParticipants    topPercentage    badge {      name    }  },  matchedUser(username: $username) {    contestBadge {      name      expired      hoverText      icon    }    profile {      ranking    }  },  userProfileUserQuestionProgressV2(userSlug: $username) {    numAcceptedQuestions {      count      difficulty    }    userSessionBeatsPercentage {      difficulty      percentage    }    totalQuestionBeatsPercentage  },    allQuestionsCount {    difficulty    count  },  matchedUser(username: $username) {    submitStats {      acSubmissionNum {        difficulty        count        submissions      }      totalSubmissionNum {        difficulty        count        submissions      }    }  }}",
					"variables": {
					"username": "%s"
					},
					"operationName": "userPublicProfile"
					}""",
			UserPublicProfile.USER);

	UserPublicProfile user;

	private final String template = """
			* < :computer: > [Link](https://leetcode.com/u/%s/)
			* < :octocat: > [Link](https://github.com/matheus0392/leetCode/)

			## %s
			> ### **Ranking `%,d`** %s  %s &emsp;&emsp;&emsp; **Contest Rating `%,d`** %s &emsp;&emsp;&emsp; **Badges `%d`**%s
			>**Global Ranking**  `%,d/%,d` &emsp;&emsp;&emsp; Top `%.2f%%` &emsp;&emsp;&emsp; Attended `%d`
			>| Submissions     | All |:small_red_triangle:| %s EASY| %s MEDIUM| %s HARD|
			>|----------------:|:---:|-------------------:|-------:|---------:|-------:|
			>| **Accepted**    |**`%d/%d`**|**%d** :heavy_check_mark:|`%d/%d`|`%d/%d`|`%d/%d`|
			>| **Beats**       |**`%.2f%%`**|**%s \\ %s**|`%.2f%%`|`%.2f%%`|`%.2f%%`|
			>| **Total**|**`%.2f%% (%d/%d)`**|**%s %s** :dart:|`%d/%d`|`%d/%d`|`%d/%d`|
			""";

	Optional<InfoQuestions> QuestionFilter(List<InfoQuestions> questions, String difficulty) {
		return questions.stream().filter(s -> s.getDifficulty().toLowerCase().equals(difficulty.toLowerCase()))
				.findFirst();
	}

	int QuestionCount(List<InfoQuestions> questions, String difficulty) {
		Optional<InfoQuestions> question = QuestionFilter(questions, difficulty);
		if (question.isPresent()) {
			return question.get().getCount();
		}
		return -1;
	}

	int QuestionSubmissions(List<InfoQuestions> questions, String difficulty) {
		Optional<InfoQuestions> question = QuestionFilter(questions, difficulty);
		if (question.isPresent()) {
			return question.get().getSubmissions();
		}
		return -1;
	}

	BigDecimal QuestionPrcentage(List<InfoQuestions> questions, String difficulty) {
		Optional<InfoQuestions> question = QuestionFilter(questions, difficulty);
		if (question.isPresent()) {
			return question.get().getPercentage();
		}
		return new BigDecimal(0.0);
	}

	String questionType(UserPublicProfile lastUserProfile, UserPublicProfile user) {
		String[] types = { "Easy", "Medium", "Hard" };

		for (String type : types) {

			if (QuestionCount(user.getUserProfileUserQuestionProgressV2().getNumAcceptedQuestions(),
					type) != QuestionCount(
							lastUserProfile.getUserProfileUserQuestionProgressV2().getNumAcceptedQuestions(), type)) {
				return type;
			}
		}
		return "";
	}

	void WriteFile(Path path, String args) {
		try (Scanner sc = new Scanner(path.toFile());) {
			StringBuilder buffer = new StringBuilder();
			buffer.append(args);

			try (FileWriter writer = new FileWriter(path.toFile())) {
				writer.write(buffer.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void OverwriteFile(Path path, String args, int skip) {
		try (Scanner sc = new Scanner(path.toFile());) {
			StringBuilder buffer = new StringBuilder();
			buffer.append(args);
			for (int x = 0; x < skip; x++) {
				if (sc.hasNextLine()) {
					sc.nextLine();
				}
			}

			while (sc.hasNextLine()) {
				buffer.append(sc.nextLine()).append(System.lineSeparator());
			}

			try (FileWriter writer = new FileWriter(path.toFile())) {
				writer.write(buffer.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	String ReadFile(Path path) throws FileNotFoundException {
		StringBuilder buffer = new StringBuilder();
		try (Scanner myReader = new Scanner(path.toFile())) {
			while (myReader.hasNextLine()) {
				buffer.append(myReader.nextLine());
			}
		}
		return buffer.toString();
	}
}
