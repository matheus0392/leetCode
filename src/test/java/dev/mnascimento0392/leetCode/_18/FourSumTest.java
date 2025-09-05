package dev.mnascimento0392.leetCode._18;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class FourSumTest extends TestFormatter {

	FourSumTest() {
		setQuestion("18. 4Sum");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0),
				List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1)));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().fourSum(new int[] { 2, 2, 2, 2, 2 }, 8), List.of(List.of(2, 2, 2, 2)));
	}

}
