package dev.mnascimento0392.leetCode;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class UserPublicProfile {
	
	final static String USER ="mnascimento0392";
	
	UserContestRanking userContestRanking;
	MatchedUser matchedUser;
	UserProfileUserQuestionProgress userProfileUserQuestionProgressV2;
	private List<InfoQuestions> allQuestionsCount;
}

@Data
class UserContestRanking {
	public int attendedContestsCount;
	public double rating;
	public int globalRanking;
	public double topPercentage;
	public int totalParticipants;
	public Object badge;
}
@Data
class MatchedUser {
	public SubmitStats submitStats;
	public Profile profile;
	public Object contestBadge;
}
@Data
class Profile {
	public int ranking;
}
@Data
class SubmitStats {
	public List<InfoQuestions> acSubmissionNum;
	public List<InfoQuestions> TotalSubmissionNum;
}
@Data
class UserProfileUserQuestionProgress  {
	private List<InfoQuestions> numAcceptedQuestions;
	private List<InfoQuestions> userSessionBeatsPercentage;
	// private List<NumUntouchedQuestions> numUntouchedQuestions;
	private BigDecimal totalQuestionBeatsPercentage;
}
@Data
class InfoQuestions {
	private String difficulty;
	private int count;
	private BigDecimal percentage;
	private int submissions;
}
	class QuestionCount{
			
}