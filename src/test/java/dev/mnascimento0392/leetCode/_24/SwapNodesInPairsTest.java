package dev.mnascimento0392.leetCode._24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.TestFormatter;
import dev.mnascimento0392.leetCode.Definitions.ListNode;
import lombok.extern.java.Log;

@Log
@TestInstance(Lifecycle.PER_CLASS)
class SwapNodesInPairsTest extends TestFormatter {

	SwapNodesInPairsTest() {
		setQuestion("24. Swap Nodes in Pairs");
	}

	@Test
	void test1() {
		assertFormatted(new Solution().swapPairs(new ListNode(1, 2, 3, 4)), new ListNode(2, 1, 4, 3));
	}

	@Test
	void test2() {
		assertFormatted(new Solution().swapPairs(null), null);
	}

	@Test
	void test3() {
		assertFormatted(new Solution().swapPairs(new ListNode(1)), new ListNode(1));
	}

	@Test
	void test4() {
		assertFormatted(new Solution().swapPairs(new ListNode(1, 2, 3)), new ListNode(2, 1, 3));
	}

}
