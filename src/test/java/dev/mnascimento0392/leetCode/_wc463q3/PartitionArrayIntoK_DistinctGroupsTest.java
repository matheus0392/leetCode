package dev.mnascimento0392.leetCode._wc463q3;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class PartitionArrayIntoK_DistinctGroupsTest {

	@BeforeAll
	void test() {
		System.err.println("Q2. Partition Array Into K-Distinct Groups");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().partitionArray(new int[] { 1, 2, 3, 4 }, 2), true);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().partitionArray(new int[] { 3, 5, 2, 2 }, 2), true);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().partitionArray(new int[] { 1, 5, 2, 3 }, 3), false);
	}

	@Test
	void test4() {
		assertFormatted(new Solution().partitionArray(new int[] { 74, 103, 74 }, 3), false);
	}

	@Test
	void test5() {
		assertFormatted(new Solution().partitionArray(new int[] { 35, 39, 65, 101, 101, 54, 1, 111, 8, 107, 96, 90, 91,
				54, 115, 36, 46, 76, 111, 39, 29, 122, 4, 113, 101, 73, 125, 39, 124, 33, 82, 39 }, 16), false);
	}

}