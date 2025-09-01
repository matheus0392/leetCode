package dev.mnascimento0392.leetCode._11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class ContainerWithMostWater extends TestFormatter {

	ContainerWithMostWater() {
		setQuestion("11. Container With Most Water");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }), 49);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().maxArea(new int[] { 1, 1 }), 1);
	}

}
