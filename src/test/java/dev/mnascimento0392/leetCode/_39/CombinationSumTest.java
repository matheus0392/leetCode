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
		assertFormatted(new Solution().combinationSum(new int[]{ 2 ,3 ,6 ,7 }, 7), List.of( 2 ,2 ,3 ,7 ));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().combinationSum(new int[]{ 2 ,3 ,5 }, 8), List.of( 2 ,2 ,2 ,2 ,2 ,3 ,3 ,3 ,5 ));
	}

	@Test
	void test3() {
		assertFormatted(new Solution().combinationSum(new int[]{ 2 }, 1), List.of(  ));
	}


}
