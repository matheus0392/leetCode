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

}
