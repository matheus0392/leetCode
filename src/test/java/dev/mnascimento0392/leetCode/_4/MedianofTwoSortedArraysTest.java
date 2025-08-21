package dev.mnascimento0392.leetCode._4;

import static dev.mnascimento0392.leetCode.TestFormatter.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class MedianofTwoSortedArraysTest {

	@BeforeAll
	void test() {
		System.err.println("4. Median of Two Sorted Arrays Test");
	}


	@Test
	void test1() {
		assertFormatted(new Solution().findMedianSortedArrays(new int[] {1,3}, new int[] {2}), 2.0);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}), 2.5);
	}


}
