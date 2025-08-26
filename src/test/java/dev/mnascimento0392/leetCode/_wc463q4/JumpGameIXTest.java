package dev.mnascimento0392.leetCode._wc463q4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class JumpGameIXTest extends TestFormatter {

	JumpGameIXTest() {
		setQuestion("Q3. Jump Game IX");
	}

	@Test
	void test0() {
		assertArrayFormatted(new Solution().maxValue(new int[] { 3, 2, 1 }), new int[] { 3, 3, 3 });
	}

	@Test
	void test1() {
		assertArrayFormatted(new Solution().maxValue(new int[] { 2, 1, 3 }), new int[] { 2, 2, 3 });
	}

	@Test
	void test2() {
		assertArrayFormatted(new Solution().maxValue(new int[] { 2, 3, 1 }), new int[] { 3, 3, 3 });
	}

	@Test
	void test4() {
		assertArrayFormatted(new Solution().maxValue(new int[] { 8, 12 }), new int[] { 8, 12 });
	}

	@Test
	void test5() {
		assertArrayFormatted(new Solution().maxValue(new int[] { 1 }), new int[] { 1 });
	}

	@Test
	void test6() {
		assertArrayFormatted(new Solution().maxValue(new int[] { 2, 3, 1, 4 }), new int[] { 3, 3, 3, 4 });
	}

	@Test
	void test7() {
		assertArrayFormatted(new Solution().maxValue(new int[] { 14, 9, 3, 10 }), new int[] { 14, 14, 14, 14 });
	}

	@Test
	void test8() {
		assertArrayFormatted(new Solution().maxValue(new int[] { 30, 21, 5, 35, 24 }),
				new int[] { 35, 35, 35, 35, 35 });
	}
}