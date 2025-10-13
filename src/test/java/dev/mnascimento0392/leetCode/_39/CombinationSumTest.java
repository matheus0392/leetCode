package dev.mnascimento0392.leetCode._39;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class CombinationSumTest extends TestFormatter {

	CombinationSumTest() {
		setQuestion("39. Combination Sum");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().combinationSum(new int[] { 2, 3, 6, 7 }, 7),
				List.of(List.of(2, 2, 3), List.of(7)));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().combinationSum(new int[] { 2, 3, 5 }, 8),
				List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)));
	}

	@Test
	void test3() {
		assertFormatted(new Solution().combinationSum(new int[] { 2 }, 1), List.of());
	}

	@Test
	void test4() {
		assertFormatted(
				new Solution().combinationSum(new int[] { 36, 21, 2, 3, 23, 24, 38, 22, 11, 14, 15, 25, 32, 19, 35, 26,
						31, 13, 34, 29, 12, 37, 17, 20, 39, 30, 40, 28, 27, 33 }, 35),
				List.of(List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3),
						List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3),
						List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 11), List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 13),
						List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3),
						List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 12), List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15),
						List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 11), List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 14),
						List.of(2, 2, 2, 2, 2, 2, 2, 2, 2, 17), List.of(2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 13),
						List.of(2, 2, 2, 2, 2, 2, 2, 2, 19), List.of(2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3),
						List.of(2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 12), List.of(2, 2, 2, 2, 2, 2, 2, 3, 3, 15),
						List.of(2, 2, 2, 2, 2, 2, 2, 21), List.of(2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 11),
						List.of(2, 2, 2, 2, 2, 2, 3, 3, 3, 14), List.of(2, 2, 2, 2, 2, 2, 3, 3, 17),
						List.of(2, 2, 2, 2, 2, 2, 3, 20), List.of(2, 2, 2, 2, 2, 2, 11, 12),
						List.of(2, 2, 2, 2, 2, 2, 23), List.of(2, 2, 2, 2, 2, 3, 3, 3, 3, 13),
						List.of(2, 2, 2, 2, 2, 3, 3, 19), List.of(2, 2, 2, 2, 2, 3, 11, 11),
						List.of(2, 2, 2, 2, 2, 3, 22), List.of(2, 2, 2, 2, 2, 11, 14), List.of(2, 2, 2, 2, 2, 12, 13),
						List.of(2, 2, 2, 2, 2, 25), List.of(2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3),
						List.of(2, 2, 2, 2, 3, 3, 3, 3, 3, 12), List.of(2, 2, 2, 2, 3, 3, 3, 3, 15),
						List.of(2, 2, 2, 2, 3, 3, 21), List.of(2, 2, 2, 2, 3, 11, 13), List.of(2, 2, 2, 2, 3, 12, 12),
						List.of(2, 2, 2, 2, 3, 24), List.of(2, 2, 2, 2, 12, 15), List.of(2, 2, 2, 2, 13, 14),
						List.of(2, 2, 2, 2, 27), List.of(2, 2, 2, 3, 3, 3, 3, 3, 3, 11),
						List.of(2, 2, 2, 3, 3, 3, 3, 3, 14), List.of(2, 2, 2, 3, 3, 3, 3, 17),
						List.of(2, 2, 2, 3, 3, 3, 20), List.of(2, 2, 2, 3, 3, 11, 12), List.of(2, 2, 2, 3, 3, 23),
						List.of(2, 2, 2, 3, 11, 15), List.of(2, 2, 2, 3, 12, 14), List.of(2, 2, 2, 3, 13, 13),
						List.of(2, 2, 2, 3, 26), List.of(2, 2, 2, 12, 17), List.of(2, 2, 2, 14, 15),
						List.of(2, 2, 2, 29), List.of(2, 2, 3, 3, 3, 3, 3, 3, 13), List.of(2, 2, 3, 3, 3, 3, 19),
						List.of(2, 2, 3, 3, 3, 11, 11), List.of(2, 2, 3, 3, 3, 22), List.of(2, 2, 3, 3, 11, 14),
						List.of(2, 2, 3, 3, 12, 13), List.of(2, 2, 3, 3, 25), List.of(2, 2, 3, 11, 17),
						List.of(2, 2, 3, 13, 15), List.of(2, 2, 3, 14, 14), List.of(2, 2, 3, 28), List.of(2, 2, 11, 20),
						List.of(2, 2, 12, 19), List.of(2, 2, 14, 17), List.of(2, 2, 31),
						List.of(2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3), List.of(2, 3, 3, 3, 3, 3, 3, 3, 12),
						List.of(2, 3, 3, 3, 3, 3, 3, 15), List.of(2, 3, 3, 3, 3, 21), List.of(2, 3, 3, 3, 11, 13),
						List.of(2, 3, 3, 3, 12, 12), List.of(2, 3, 3, 3, 24), List.of(2, 3, 3, 12, 15),
						List.of(2, 3, 3, 13, 14), List.of(2, 3, 3, 27), List.of(2, 3, 11, 19), List.of(2, 3, 13, 17),
						List.of(2, 3, 15, 15), List.of(2, 3, 30), List.of(2, 11, 11, 11), List.of(2, 11, 22),
						List.of(2, 12, 21), List.of(2, 13, 20), List.of(2, 14, 19), List.of(2, 33),
						List.of(3, 3, 3, 3, 3, 3, 3, 3, 11), List.of(3, 3, 3, 3, 3, 3, 3, 14),
						List.of(3, 3, 3, 3, 3, 3, 17), List.of(3, 3, 3, 3, 3, 20), List.of(3, 3, 3, 3, 11, 12),
						List.of(3, 3, 3, 3, 23), List.of(3, 3, 3, 11, 15), List.of(3, 3, 3, 12, 14),
						List.of(3, 3, 3, 13, 13), List.of(3, 3, 3, 26), List.of(3, 3, 12, 17), List.of(3, 3, 14, 15),
						List.of(3, 3, 29), List.of(3, 11, 21), List.of(3, 12, 20), List.of(3, 13, 19),
						List.of(3, 15, 17), List.of(3, 32), List.of(11, 11, 13), List.of(11, 12, 12), List.of(11, 24),
						List.of(12, 23), List.of(13, 22), List.of(14, 21), List.of(15, 20), List.of(35)));
		;
	}
}
