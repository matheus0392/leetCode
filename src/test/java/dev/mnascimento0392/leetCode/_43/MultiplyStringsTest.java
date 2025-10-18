package dev.mnascimento0392.leetCode._43;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class MultiplyStringsTest extends TestFormatter {

	MultiplyStringsTest() {
		setQuestion("43. Multiply Strings");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().multiply("2", "3"), "6");
	}

	@Test
	void test2() {
		assertFormatted(new Solution().multiply("123", "456"), "56088");
	}

	@Test
	void test3() {
		assertFormatted(new Solution().multiply("0", "0"), "0");
	}

	@Test
	void test4() {
		assertFormatted(new Solution().multiply("1", "0"), "0");
	}

	@Test
	void test5() {
		assertFormatted(new Solution().multiply("1", "1"), "1");
	}

	@Test
	void test6() {
		assertFormatted(new Solution().multiply("1010", "101"), "102010");
	}
	
	
	@Test
	void test7() {
		assertFormatted(new Solution().multiply("999999999999999999999999999999999999", "1"), "999999999999999999999999999999999999");
	}
	
	@Test
	void test8() {
		assertFormatted(new Solution().multiply("999999999999999999999999999999999999", "999999999999999999999999999999999999"), "999999999999999999999999999999999998000000000000000000000000000000000001");
	}
}
