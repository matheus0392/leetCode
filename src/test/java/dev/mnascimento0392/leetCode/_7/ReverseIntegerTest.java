package dev.mnascimento0392.leetCode._7;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class ReverseIntegerTest {

	@BeforeAll
	void test() {
		System.err.println("7. Reverse Integer");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().reverse(123), 321);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().reverse(-123), -321);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().reverse(120), 21);
	}
	
	@Test
	void test4() {
		assertFormatted(new Solution().reverse(1), 1);
	}
	
	@Test
	void test5() {
		assertFormatted(new Solution().reverse(10), 1);
	}
	@Test
	void test6() {
		assertFormatted(new Solution().reverse(100), 1);
	}
}