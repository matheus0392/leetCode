package dev.mnascimento0392.leetCode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ChargeChallenge {

	public static void main(String[] args) throws IOException, InterruptedException {

		new GenerateSummaryHistory().getSummaryInfos();

		CookieManager cookieManager = new CookieManager();
		cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		CookieHandler.setDefault(cookieManager);

		System.out.print("Type the challenge name:\n>>");
		String challenge = new Scanner(System.in).nextLine();

		String url = String.format("https://leetcode.com/problems/%s/description/", challenge);

		HttpClient client = HttpClient.newBuilder().cookieHandler(CookieManager.getDefault()).build();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Accept", "*/*")
				.header("Content-Type", "text/html; charset=utf-8").header("authority", "leetcode.com")
				.header("Upgrade-Insecure-Requests", "1").header("scheme", "https")
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36")
				.GET().build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		if (response.statusCode() == 200) {

			String response_ = response.body();
			String start = "<script id=\"__NEXT_DATA__\" type=\"application/json\">";
			response_ = response_.substring(response_.indexOf(start) + start.length(),
					response_.lastIndexOf("</script>"));

			JSONObject jo = new JSONObject(response_);
			JSONObject jo_ = jo.getJSONObject("props").getJSONObject("pageProps").getJSONObject("dehydratedState")
					.getJSONArray("queries").getJSONObject(1).getJSONObject("state").getJSONObject("data")
					.getJSONObject("question");

			String codeSnippets = jo_.getJSONArray("codeSnippets").getJSONObject(1).getString("code");
			JSONArray exampleTestcaseList = jo_.getJSONArray("exampleTestcaseList");
			JSONArray hints = jo_.getJSONArray("hints");
			JSONArray topicTags = jo_.getJSONArray("topicTags");
			String difficulty = jo_.getString("difficulty");
			String questionId = jo_.getString("questionId");
			String questionTitle = jo_.getString("questionTitle");
			String htmlContent = jo_.getString("content");
			JSONObject metaData = new JSONObject(jo_.getString("metaData"));

			// criar
			//
			// - pacote src|test
			// - arquivo .java
			// - arquivo Test.java
			// - descricao:
			// - - url questionId
			// - -questionTitle
			// - -difficulty type
			// - -htmlContent
			// - -hints

			String folder = ChargeChallenge.class.getCanonicalName();

			folder = String.format("src/main/java/%s_%s/",
					folder.substring(0, folder.lastIndexOf(".") + 1).replaceAll("\\.", "/"), questionId);
			Path path = Path.of(folder);

			if (!path.toFile().exists()) {

				createDescription(folder, url, questionTitle, difficulty, questionId, htmlContent, topicTags, hints);

				createCodeFile(questionId, questionTitle, codeSnippets);

				createCodeTestFile(questionTitle, questionId, exampleTestcaseList, htmlContent, metaData);

				System.out.println("Challenge got");
			} else {
				System.out.println("Challenge already got");
			}
		} else {
			System.out.println(response.statusCode());
		}

	}

	// - url
	// - questionId- questionTitle
	// - difficulty tags
	// - htmlContent
	// - hints
	private static void createDescription(String folder, String url, String questionTitle, String difficulty,
			String questionId, String htmlContent, JSONArray topicTags, JSONArray hints) throws IOException {

		new File(folder).mkdir();
		new File(folder.replace("main", "test")).mkdir();
		File file = new File(folder + "Description.html");
		file.createNewFile();
		FileOutputStream x = new FileOutputStream(file);
		StringBuilder sb = new StringBuilder();

		sb.append("""
				<html lang=\"en\" class=\"light\" style=\"color-scheme: light; --nav-min-w: 731px;\">
						<head>
							<link rel="stylesheet" href="../style.css">
							<link rel="stylesheet" href="../HTMLContent.iso.css">
						</head>
					<body>
						<div class=\"flex h-full w-full flex-col\">
						<div class=\"flex w-full flex-1 flex-col gap-4 overflow-y-auto px-4 py-5\">
				""");

		sb.append(String.format("""
				<p><h2><strong>
				%s%s%s
				</strong></h2></p>
				""", questionId, ". ", questionTitle));

		sb.append("<p>&nbsp;</p>");
		sb.append("<div class=\"flex gap-1\">");
		sb.append(String.format(
				"""
						<div class="relative inline-flex items-center justify-center text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary text-difficulty-%s dark:text-difficulty-%s">%s</div>
						""",
				difficulty.toLowerCase(), difficulty.toLowerCase(), difficulty));

		for (int i = 0; i < topicTags.length(); i++) {
			String tag = topicTags.getJSONObject(i).getString("name");
			sb.append(String.format(
					"""
							<div class=\"relative inline-flex items-center justify-center text-caption px-2 py-1 gap-1 rounded-full bg-fill-secondary \">%s</div>
							""",
					tag));
		}
		sb.append("</div><div class=\"elfjS\">");

		sb.append(htmlContent);
		sb.append("<p>&nbsp;</p>");
		for (int i = 0; i < hints.length(); i++) {

			sb.append(String.format("<p><strong>Hints %s:</strong></p>", i));
			String hint = hints.get(i).toString();
			sb.append(String.format("""
					<div class=\"text-body text-sd-foreground mt-2 pl-7 elfjS \">%s</div>
					""", hint));
		}

		sb.append("<p>&nbsp;</p>");
		sb.append("source: " + url);
		sb.append("</div></div></div></body></html>");

		x.write(sb.toString().getBytes());
		x.flush();
		x.close();
	}

	private static void createCodeFile(String questionId, String questionTitle, String codeSnippets)
			throws IOException {
		String fileName = fileName(questionId, questionTitle) + ".java";

		File file = new File(fileName);
		file.createNewFile();
		FileOutputStream fis = new FileOutputStream(file);
		fis.write((ChargeChallenge.class.getPackage() + "._" + questionId + ";\n\n").getBytes());
		fis.write(codeSnippets.getBytes());
		fis.flush();
		fis.close();
	}

	private static void createCodeTestFile(String questionTitle, String questionId, JSONArray exampleTestcaseList,
			String content, JSONObject metaData) throws IOException {

		String fileName = fileName(questionId, questionTitle).replace("main", "test") + "Test.java";

		content = content.substring(content.indexOf("Example 1:") + "Example 1:".length(),
				content.indexOf("Constraints:"));

		content = content.replaceAll("<{1}[a-zA-Z=\\\"\\- ]*>|<{1}/{1}[a-zA-Z=\\\"\\- ]*>|\s+", "")
				.replaceAll("(\n\n)", "\n").replaceAll("&quot;", "\"");

		File file = new File(fileName);
		file.createNewFile();
		FileOutputStream fis = new FileOutputStream(file);

		StringBuilder sb = new StringBuilder();

		String className = toCamelCase(questionTitle);
		String functionName = metaData.getString("name");
		JSONArray types = metaData.getJSONArray("params");

		List<InputParams> inputs = new ArrayList<InputParams>();
		types.forEach(t -> {
			inputs.add(new InputParams(((JSONObject) t).getString("name"), ((JSONObject) t).getString("type")));
		});

		String returnType = metaData.getJSONObject("return").getString("type");

		for (int i = 0; i < exampleTestcaseList.length(); i++) {
			sb.append(caseTest(i + 1, functionName, content, inputs, returnType));
		}

		String testCases = sb.toString();
		sb = new StringBuilder();

		sb.append(String.format("""
				package dev.mnascimento0392.leetCode._%s;

				import org.junit.jupiter.api.Test;
				import org.junit.jupiter.api.TestInstance;
				import org.junit.jupiter.api.TestInstance.Lifecycle;

				import dev.mnascimento0392.leetCode.TestFormatter;
				import lombok.extern.java.Log;

				@Log
				@TestInstance(Lifecycle.PER_CLASS)
				class %sTest extends TestFormatter {

					%sTest() {
						setQuestion("%s. %s");
					}

					%s
				}
				""", questionId, className, className, questionId, questionTitle, testCases));

		fis.write(sb.toString().getBytes());
		fis.flush();
		fis.close();
	}

	private static String caseTest(int i, String functionName, String content, List<InputParams> inputs,
			String returnType) {

		String[] lines = content.split("\n");
		int indx = 0, count = 0;
		for (int x = 0; x < lines.length; x++) {
			if (lines[x].contains("Input:")) {
				indx = x;
				count += 1;
				if (count == i) {
					break;
				}
			}
		}

		String input = "";
		String output = lines[indx + 1].substring(7, lines[indx + 1].length());
		for (int x = 0; x < inputs.size(); x++) {
			String param = inputs.get(x).getName() + "=";
			int init_indx = lines[indx].indexOf(param) + param.length();

			String input_ = lines[indx].substring(init_indx);
			if (x < inputs.size() - 1) {
				int last_indx = lines[indx].indexOf("," + inputs.get(x + 1).getName());
				input_ = lines[indx].substring(init_indx, last_indx);
			}
			if (inputs.get(x).getType().contains("[]")) {
				input_ = "new " + inputs.get(x).getType() + "{ "
						+ input_.replace("[", "").replace("]", "").replaceAll(",", " ,") + " }";
			} else if (inputs.get(x).getType().contains("ListNode")) {
				input_ = "new ListNode( " + input_.replace("[", "").replace("]", "").replaceAll(",", " ,") + " )";
			}

			input += x > 0 ? ", " : "";
			input += input_;
		}

		String testType = "assertFormatted";

		if (returnType.contains("[]")) {
			output = "new " + returnType + "{ " + output.replaceAll(",", " ,") + " }";
			testType = "assertArrayFormatted";
		} else if (returnType.contains("list<")) {
			output = "List.of( " + output.replace("[", "").replace("]", "").replaceAll(",", " ,") + " )";
		} else if (returnType.contains("ListNode")) {
			output = "new ListNode( " + output.replace("[", "").replace("]", "").replaceAll(",", " ,") + " )";
		}

		return String.format("""
					@Test
					void test%d() {
						%s(new Solution().%s(%s), %s);
					}

				""", i, testType, functionName, input, output).replaceAll("integer", "int").replaceAll("string",
				"String");

	}

	private static String fileName(String questionId, String questionTitle) {
		String folder = ChargeChallenge.class.getCanonicalName();

		folder = "src/main/java/" + folder.substring(0, folder.lastIndexOf(".") + 1).replaceAll("\\.", "/") + "_"
				+ questionId + "/";

		return folder + toCamelCase(questionTitle);
	}

	private static String toCamelCase(String string) {
		return String.join("", Arrays.stream(string.split(" "))
				.map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1)).toList());
	}
}

@Data
@AllArgsConstructor
class InputParams {
	String name;
	String type;
}