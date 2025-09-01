package dev.mnascimento0392.leetCode._13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class RomantoIntegerTest extends TestFormatter {

	RomantoIntegerTest() {
		setQuestion("13. Roman to Integer");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().romanToInt("III"), 3);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().romanToInt("LVIII"), 58);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().romanToInt("MCMXCIV"), 1994);
	}

}
