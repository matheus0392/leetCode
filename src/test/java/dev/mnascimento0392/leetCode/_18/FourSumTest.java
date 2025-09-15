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

	//@Test
	void test3() {
		assertFormatted(new Solution().fourSum(new int[] { -3, -2, -1, 0, 0, 1, 2, 3 }, 0),
				List.of(List.of(-3, -2, 2, 3), List.of(-3, -1, 1, 3), List.of(-3, 0, 0, 3), List.of(-2, -1, 0, 3),
						List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1), List.of(-3, 0, 1, 2)));
	}

	@Test
	void test4() {
		assertFormatted(new Solution().fourSum(new int[] { -5, -4, -3, -2, -1, 0, 0, 1, 2, 3, 4, 5 }, 0),
				List.of(List.of(-5, -4, 4, 5), List.of(-5, -3, 3, 5), List.of(-5, -2, 2, 5), List.of(-5, -1, 1, 5),
						List.of(-5, 0, 0, 5), List.of(-5, -2, 3, 4), List.of(-5, -1, 2, 4), List.of(-5, 0, 1, 4),
						List.of(-5, 0, 2, 3), List.of(-4, -3, 2, 5), List.of(-4, -2, 1, 5), List.of(-4, -1, 0, 5),
						List.of(-4, -3, 3, 4), List.of(-4, -2, 2, 4), List.of(-4, -1, 1, 4), List.of(-4, 0, 0, 4),
						List.of(-4, -1, 2, 3), List.of(-4, 0, 1, 3), List.of(-3, -2, 0, 5), List.of(-3, -2, 1, 4),
						List.of(-3, -1, 0, 4), List.of(-3, -2, 2, 3), List.of(-3, -1, 1, 3), List.of(-3, 0, 0, 3),
						List.of(-3, 0, 1, 2), List.of(-2, -1, 0, 3), List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2),
						List.of(-1, 0, 0, 1)));
	}

	@Test
	void test0() {
		assertFormatted(
				new Solution().fourSum(new int[] { 1000000000, 1000000000, 1000000000, 1000000000 }, -294967296),
				List.of());
	}

}
