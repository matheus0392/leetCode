package dev.mnascimento0392.leetCode._21;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import dev.mnascimento0392.leetCode.Definitions.ListNode;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class MergeTwoSortedListsTest extends TestFormatter {

	MergeTwoSortedListsTest() {
		setQuestion("21. Merge Two Sorted Lists");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().mergeTwoLists(new ListNode(1, 2, 4), new ListNode(1, 3, 4)),
				new ListNode(1, 1, 2, 3, 4, 4));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().mergeTwoLists(null, null), null);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().mergeTwoLists(null, new ListNode(0)), new ListNode(0));
	}

	@Test
	void test4() {
		assertFormatted(
				new Solution().mergeTwoLists(new ListNode(-100, -10, 0, 10, 100), new ListNode(0, 1, 2, 3, 4, 5)),
				new ListNode(-100, -10, 0, 0, 1, 2, 3, 4, 5, 10, 100));
	}

	@Test
	void test5() {
		assertFormatted(new Solution().mergeTwoLists(new ListNode(0), new ListNode(0, 1, 2, 3, 4, 5)),
				new ListNode(0, 0, 1, 2, 3, 4, 5));
	}

	@Test
	void test6() {
		assertFormatted(new Solution().mergeTwoLists(new ListNode(0), new ListNode(0, 1)), new ListNode(0, 0, 1));
	}

	@Test
	void test7() {
		assertFormatted(new Solution().mergeTwoLists(new ListNode(0), new ListNode(1)), new ListNode(0, 1));
	}

}
