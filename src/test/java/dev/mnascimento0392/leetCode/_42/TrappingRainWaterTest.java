package dev.mnascimento0392.leetCode._42;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class TrappingRainWaterTest extends TestFormatter {

	TrappingRainWaterTest() {
		setQuestion("42. Trapping Rain Water");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }), 6);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().trap(new int[] { 4, 2, 0, 3, 2, 5 }), 9);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().trap(new int[] { 0, 0, 0, 0, 0 }), 0);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().trap(new int[] { 1, 1 }), 0);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().trap(new int[] { 1, 2, 3, 2, 1 }), 0);
	}

	@Test
	void test6() {
		assertFormatted(new Solution().trap(new int[] { 1, 0, 1 }), 1);
	}

	@Test
	void test7() {
		assertFormatted(new Solution().trap(new int[] { 4, 2, 3 }), 1);
	}

	@Test
	void test8() {
		assertFormatted(new Solution().trap(new int[] { 0, 7, 1, 4, 6 }), 7);
	}

	@Test
	void test9() {
		List<String> scan = readTestCase("TestCase1.txt", 2);

		int[] int1 = scanToInt(scan.get(0));
		int int2 = Integer.valueOf(scan.get(1));

		assertFormatted(new Solution().trap(int1), int2);
	}

}
