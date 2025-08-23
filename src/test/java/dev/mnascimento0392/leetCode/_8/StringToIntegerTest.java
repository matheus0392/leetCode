package dev.mnascimento0392.leetCode._8;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class StringToIntegerTest {

	@BeforeAll
	void test() {
		System.err.println("8. String to Integer (atoi)");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().myAtoi("42"), 42);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().myAtoi(" -042"), -42);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().myAtoi("1337c0d3"), 1337);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().myAtoi("0-1"), 0);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().myAtoi("words and 987"), 0);
	}
	
	@Test
	void test6() {
		assertFormatted(new Solution().myAtoi("-91283472332"), -2147483648);
	}

	@Test
	void test7() {
		assertFormatted(new Solution().myAtoi(""), 0);
	}
	
	@Test
	void test8() {
		assertFormatted(new Solution().myAtoi("+1"), 1);
	}
	
	@Test
	void test9() {
		assertFormatted(new Solution().myAtoi("-+12"), 0);
	}
	
	@Test
	void test10() {
		assertFormatted(new Solution().myAtoi("20000000000000000000"), Integer.MAX_VALUE);
	}

}