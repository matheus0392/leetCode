package dev.mnascimento0392.leetCode._26;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class RemoveDuplicatesFromSortedArrayTest extends TestFormatter {

	RemoveDuplicatesFromSortedArrayTest() {
		setQuestion("26. Remove Duplicates from Sorted Array");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().removeDuplicates(new int[] { 1, 1, 2 }), 2);
	}

	@Test
	void test2() {
		assertFormatted(new Solution().removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }), 5);
	}

}
