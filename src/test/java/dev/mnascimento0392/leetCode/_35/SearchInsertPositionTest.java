package dev.mnascimento0392.leetCode._35;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class SearchInsertPositionTest extends TestFormatter {

	SearchInsertPositionTest() {
		setQuestion("35. Search Insert Position");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 3, 5, 6 }, 5), 2);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 3, 5, 6 }, 2), 1);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 3, 5, 6 }, 7), 4);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().searchInsert(new int[] { 1 }, 0), 0);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().searchInsert(new int[] { 1 }, 1), 0);
	}

	@Test
	void test6() {
		assertFormatted(new Solution().searchInsert(new int[] { 7, 8, 10 }, 7), 0);
	}

	@Test
	void test7() {
		assertFormatted(new Solution().searchInsert(new int[] { 7, 8, 9 }, 9), 2);
	}

	@Test
	void test8() {
		assertFormatted(new Solution().searchInsert(new int[] { 7, 8, 9 }, 8), 1);
	}

	@Test
	void test9() {
		assertFormatted(new Solution().searchInsert(new int[] { 7, 8, 9 }, 6), 0);
	}

	@Test
	void test10() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 3 }, 1), 0);
	}

	@Test
	void test11() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 3 }, 2), 1);
	}

	@Test
	void test12() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 3 }, 3), 1);
	}

	@Test
	void test13() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 2, 4, 6 }, 3), 2);
	}

	@Test
	void test14() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 2, 4, 6, 7 }, 3), 2);
	}

	@Test
	void test15() {
		assertFormatted(new Solution().searchInsert(new int[] { 1, 2, 4, 6, 7, 8 }, 3), 2);
	}
}
