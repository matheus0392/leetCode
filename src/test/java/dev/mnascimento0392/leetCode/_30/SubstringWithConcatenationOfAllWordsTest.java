package dev.mnascimento0392.leetCode._30;

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

}
