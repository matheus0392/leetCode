package dev.mnascimento0392.leetCode._30;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class SubstringWithConcatenationOfAllWordsTest extends TestFormatter {

	SubstringWithConcatenationOfAllWordsTest() {
		setQuestion("30. Substring with Concatenation of All Words");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().findSubstring("barfoothefoobarman", new String[] { "foo", "bar" }),
				List.of(0, 9));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().findSubstring("wordgoodgoodgoodbestword",
				new String[] { "word", "good", "best", "word" }), List.of());
	}

	@Test
	void test3() {
		assertFormatted(new Solution().findSubstring("barfoofoobarthefoobarman", new String[] { "bar", "foo", "the" }),
				List.of(6, 9, 12));
	}

	@Test
	void test4() {
		assertFormatted(new Solution().findSubstring("barfoofoobarthefoobarman", new String[] { "b", "a", "r" }),
				List.of(0, 9, 18));
	}

	@Test
	void test5() {
		assertFormatted(new Solution().findSubstring("barfooffoobarthefoobarman", new String[] { "f" }),
				List.of(3, 6, 7, 16));
	}

	@Test
	void test6() {
		assertFormatted(new Solution().findSubstring("barfoofoobarthefoobarman", new String[] { "fo" }),
				List.of(3, 6, 15));
	}

	@Test
	void test7() {
		assertFormatted(new Solution().findSubstring("barfoofoobarthefoobarman", new String[] { "f", "o" }),
				List.of(3, 5, 6, 15));
	}

	@Test
	void test8() {
		assertFormatted(new Solution().findSubstring("mississipi", new String[] { "ssi", "ssi" }), List.of(2));
	}

	@Test
	void test9() {
		assertFormatted(new Solution().findSubstring("mississippi", new String[] { "ssi", "ppi" }), List.of(5));
	}

	@Test
	void test10() {
		assertFormatted(new Solution().findSubstring("wordgoodgoodgoodbestword",
				new String[] { "word", "good", "best", "good" }), List.of(8));
	}

	@Test
	void test11() {
		assertFormatted(new Solution().findSubstring("aaaaaaaaaaaaaa", new String[] { "aa", "aa" }),
				List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

	@Test
	void test12() {
		assertFormatted(new Solution().findSubstring("aaaaaaaaaaaaaa", new String[] { "a", "a" }),
				List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
	}

	@Test
	void test13() {
		assertFormatted(new Solution().findSubstring("aaaaaaaaaaaaaa", new String[] { "aa" }),
				List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
	}

	@Test
	void test14() {

		List<String> scan = readTestCase("TestCase0.txt", 3);

		String str1 = scan.get(0);
		String[] str2 = toStringArray(scan.get(1));
		List<Integer> str3 = Arrays.stream(scan.get(2).split(",")).map(i -> Integer.parseInt(i)).toList();

		assertFormatted(new Solution().findSubstring(str1, str2), str3);
	}


}
