package dev.mnascimento0392.leetCode._155;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class ThreeSumTest extends TestFormatter {

	ThreeSumTest() {
		setQuestion("15. 3Sum");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().threeSum(new int[] { -1, 0, 1, 2, -1, -4 }),
				List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().threeSum(new int[] { 0, 1, 1 }), List.of());
	}

	@Test
	void test3() {
		assertFormatted(new Solution().threeSum(new int[] { 0, 0, 0 }), List.of(List.of(0, 0, 0)));
	}

}
