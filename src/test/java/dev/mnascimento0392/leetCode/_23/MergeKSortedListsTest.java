package dev.mnascimento0392.leetCode._23;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import dev.mnascimento0392.leetCode.Definitions.ListNode;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class MergeKSortedListsTest extends TestFormatter {

	MergeKSortedListsTest() {
		setQuestion("23. Merge k Sorted Lists");
	}

	@Test
	void test1() {
		assertFormatted(
				new Solution().mergeKLists(
						new ListNode[] { new ListNode(1, 4, 5), new ListNode(1, 3, 4), new ListNode(2, 6) }),
				new ListNode(1, 1, 2, 3, 4, 4, 5, 6));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().mergeKLists(new ListNode[] {}), null);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().mergeKLists(new ListNode[] { null }), null);
	}

}
