package dev.mnascimento0392.leetCode._19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import dev.mnascimento0392.leetCode.Definitions.ListNode;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class RemoveNthNodeFromEndOfListTest extends TestFormatter {

	RemoveNthNodeFromEndOfListTest() {
		setQuestion("19. Remove Nth Node From End of List");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().removeNthFromEnd(new ListNode(1, 2, 3, 4, 5), 2), new ListNode(1, 2, 3, 5));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().removeNthFromEnd(new ListNode(1), 1), null);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().removeNthFromEnd(new ListNode(1, 2), 1), new ListNode(1));
	}

	@Test
	void test4() {
		assertFormatted(new Solution().removeNthFromEnd(new ListNode(1, 2, 3), 1), new ListNode(1, 2));
	}

	@Test
	void test5() {
		assertFormatted(new Solution().removeNthFromEnd(new ListNode(1, 2, 3), 2), new ListNode(1, 3));
	}

	@Test
	void test0() {
		assertFormatted(new Solution().removeNthFromEnd(new ListNode(1, 2, 3), 3), new ListNode(2, 3));
	}
}
