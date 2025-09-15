package dev.mnascimento0392.leetCode._25;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import dev.mnascimento0392.leetCode.Definitions.ListNode;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class ReverseNodesInKGroupTest extends TestFormatter {

	ReverseNodesInKGroupTest() {
		setQuestion("25. Reverse Nodes in k-Group");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().reverseKGroup(new ListNode(1, 2, 3, 4, 5), 2), new ListNode(2, 1, 4, 3, 5));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().reverseKGroup(new ListNode(1, 2, 3, 4, 5), 3), new ListNode(3, 2, 1, 4, 5));
	}

	@Test
	void test3() {
		assertFormatted(new Solution().reverseKGroup(new ListNode(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 3),
				new ListNode(3, 2, 1, 6, 5, 4, 9, 8, 7, 12, 11, 10, 13, 14));
	}

	@Test
	void test4() {
		assertFormatted(new Solution().reverseKGroup(new ListNode(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), 1),
				new ListNode(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
	}
	
	@Test
	void test5() {
		assertFormatted(new Solution().reverseKGroup(new ListNode(1), 4),
				new ListNode(1));
	}

}
