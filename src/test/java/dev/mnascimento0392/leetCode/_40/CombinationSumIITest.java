package dev.mnascimento0392.leetCode._40;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class CombinationSumIITest extends TestFormatter {

	CombinationSumIITest() {
		setQuestion("40. Combination Sum II");
	}
	
	@Test
	void test1() {
		assertFormatted(new Solution().combinationSum2(new int[] { 1 }, 1),
				List.of(List.of(1)));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8),
				List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6)));
	}

	@Test
	void test3() {
		assertFormatted(new Solution().combinationSum2(new int[] { 2, 5, 2, 1, 2 }, 5),
				List.of(List.of(1, 2, 2), List.of(5)));
	}
	
	@Test
	void test4() {
		assertFormatted(new Solution().combinationSum2(new int[] { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 30),
				List.of(List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)));
	}

}
