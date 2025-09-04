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

}
