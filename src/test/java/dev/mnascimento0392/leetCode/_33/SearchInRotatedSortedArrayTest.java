package dev.mnascimento0392.leetCode._33;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class SearchInRotatedSortedArrayTest extends TestFormatter {

	SearchInRotatedSortedArrayTest() {
		setQuestion("33. Search in Rotated Sorted Array");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0), 4);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3), -1);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().search(new int[] { 1 }, 0), -1);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().search(new int[] { 0, 1, 2, 4, 5, 6, 7 }, 0), 0);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().search(new int[] { 0, 1, 2, 4, 5, 6, 7 }, 4), 3);
	}

	@Test
	void test6() {
		assertFormatted(new Solution().search(new int[] { 0, 1, 2, 4, 5, 6, 7 }, 7), 6);
	}

	@Test
	void test7() {
		assertFormatted(new Solution().search(new int[] { 1, 3, 4, 5 }, 0), -1);
	}

	@Test
	void test8() {
		assertFormatted(new Solution().search(new int[] { 1, 3, 4, 5 }, 1), 0);
	}

	@Test
	void test9() {
		assertFormatted(new Solution().search(new int[] { 1, 3, 4, 5 }, 3), 1);
	}

	@Test
	void test10() {
		assertFormatted(new Solution().search(new int[] { 1, 3, 4, 5 }, 5), 3);
	}

	@Test
	void test11() {
		assertFormatted(new Solution().search(new int[] { 1, 3, 4, 5 }, 7), -1);
	}

	@Test
	void test12() {
		assertFormatted(new Solution().search(new int[] { 3, 5, 1, 2 }, 1), 2);
	}

	@Test
	void test13() {
		assertFormatted(new Solution().search(new int[] { 3, 5, 1, 2 }, 3), 0);
	}
	
	@Test
	void test14() {
		assertFormatted(new Solution().search(new int[] { 7,8,1,2,3,4,5,6 }, 2), 3);
	}
	
	@Test
	void test15() {
		assertFormatted(new Solution().search(new int[] { 5,1,2,3,4 }, 1), 1);
	}
	
	@Test
	void test16() {
		assertFormatted(new Solution().search(new int[] {9,1,2,3,4,5,6,7,8 }, 9), 0);
	}
}
