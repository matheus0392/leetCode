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
		assertFormatted(new Solution().searchInsert(new int[]{ 1 ,3 ,5 ,6 }, 5), 2);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().searchInsert(new int[]{ 1 ,3 ,5 ,6 }, 2), 1);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().searchInsert(new int[]{ 1 ,3 ,5 ,6 }, 7), 4);
	}


}
