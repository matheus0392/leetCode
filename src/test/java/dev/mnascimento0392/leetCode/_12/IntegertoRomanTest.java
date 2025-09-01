package dev.mnascimento0392.leetCode._12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class IntegertoRomanTest extends TestFormatter {

	IntegertoRomanTest() {
		setQuestion("12. Integer to Roman");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().intToRoman(3749), "MMMDCCXLIX");
	}

	@Test
	void test2() {
		assertFormatted(new Solution().intToRoman(58), "LVIII");
	}

	@Test
	void test3() {
		assertFormatted(new Solution().intToRoman(1994), "MCMXCIV");
	}

}
