package dev.mnascimento0392.leetCode._34;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class FindFirstAndLastPositionOfElementInSortedArrayTest extends TestFormatter {

	FindFirstAndLastPositionOfElementInSortedArrayTest() {
		setQuestion("34. Find First and Last Position of Element in Sorted Array");
	}

	@Test
	void test1() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8), new int[] { 3, 4 });
	}

	@Test
	void test2() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6), new int[] { -1, -1 });
	}

	@Test
	void test3() {
		assertArrayFormatted(new Solution().searchRange(new int[] {}, 0), new int[] { -1, -1 });
	}

	@Test
	void test4() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 1 }, 0), new int[] { -1, -1 });
	}

	@Test
	void test5() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 1 }, 1), new int[] { 0, 0 });
	}

	@Test
	void test6() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 7, 7, 7, 8, 8, 10 }, 7), new int[] { 0, 2 });
	}

	@Test
	void test7() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 7, 8, 8, 8, 9 }, 9), new int[] { 4, 4 });
	}

	@Test
	void test8() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 7, 7, 8, 9, 9 }, 8), new int[] { 2, 2 });
	}

	@Test
	void test9() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 7, 7, 7, 8, 9 }, 8), new int[] { 3, 3 });
	}

	@Test
	void test10() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 7, 8, 9, 9, 9 }, 8), new int[] { 1, 1 });
	}

	@Test
	void test11() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 1, 3 }, 1), new int[] { 0, 0 });
	}
	
	@Test
	void test12() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 1, 3 }, 2), new int[] {-1,-1 });
	}
	
	@Test
	void test13() {
		assertArrayFormatted(new Solution().searchRange(new int[] { 1, 3 }, 3), new int[] { 1, 1 });
	}
}
