package dev.mnascimento0392.leetCode._wc463q2;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class GCDofOddandEvenSumsTest {

	@BeforeAll
	void test() {
		System.err.println("Q1. GCD of Odd and Even Sums");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().gcdOfOddEvenSums(4), 4);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().gcdOfOddEvenSums(5), 5);
	}

}