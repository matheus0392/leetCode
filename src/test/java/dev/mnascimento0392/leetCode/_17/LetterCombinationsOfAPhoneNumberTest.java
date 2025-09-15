package dev.mnascimento0392.leetCode._17;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class LetterCombinationsOfAPhoneNumberTest extends TestFormatter {

	LetterCombinationsOfAPhoneNumberTest() {
		setQuestion("17. Letter Combinations of a Phone Number");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().letterCombinations("23"),
				List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().letterCombinations(""), List.of());
	}

	@Test
	void test3() {
		assertFormatted(new Solution().letterCombinations("2"), List.of("a", "b", "c"));
	}

}
