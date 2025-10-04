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
		assertFormatted(new Solution().search(new int[]{ 4 ,5 ,6 ,7 ,0 ,1 ,2 }, 0), 4);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().search(new int[]{ 4 ,5 ,6 ,7 ,0 ,1 ,2 }, 3), -1);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().search(new int[]{ 1 }, 0), -1);
	}


}
