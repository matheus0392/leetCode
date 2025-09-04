package dev.mnascimento0392.leetCode._16;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class ThreeSumClosestTest extends TestFormatter {

	ThreeSumClosestTest() {
		setQuestion("16. 3Sum Closest");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().threeSumClosest(new int[] { -1, 2, 1, -4 }, 1), 2);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().threeSumClosest(new int[] { 0, 0, 0 }, 1), 0);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().threeSumClosest(new int[] { 40, -100, 0, 4, -23, 20, 124 }, -40), -40);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().threeSumClosest(new int[] { 4, 0, 5, -5, 3, 3, 0, -4, -5 }, -2), -2);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().threeSumClosest(new int[] { -4, 2, 2, 3, 3, 3 }, 0), 0);
	}

}
