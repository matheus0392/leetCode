package dev.mnascimento0392.leetCode._wc463q4;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class JumpGameIXTest {

	@BeforeAll
	void test() {
		System.err.println("Q2. Partition Array Into K-Distinct Groups");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().maxValue(new int[] { 1, 2, 3, 4 }), new int[] { 1, 2, 3, 4 });
	}

	@Test
	void test2() {
		assertFormatted(new Solution().maxValue(new int[] { 3, 5, 2, 2 }), new int[] { 1, 2, 3, 4 });
	}

}