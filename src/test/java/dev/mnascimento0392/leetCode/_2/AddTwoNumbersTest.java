package dev.mnascimento0392.leetCode._2;

import static dev.mnascimento0392.leetCode.TestFormatter.assertFormatted;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import dev.mnascimento0392.leetCode.Definitions.ListNode;

@TestInstance(Lifecycle.PER_CLASS)
class AddTwoNumbersTest {

	@BeforeAll
	void test() {
		System.err.println("2. Add Two Numbers Test");
	}

	@Test
	void test1() {

		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		ListNode l = new ListNode(7, new ListNode(0, new ListNode(8)));

		assertFormatted(new Solution().addTwoNumbers(l1, l2), l);
	}

	@Test
	void test2() {

		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode l = new ListNode(0);

		assertFormatted(new Solution().addTwoNumbers(l1, l2), l);
	}

	@Test
	void test3() {

		ListNode l1 = new ListNode(9,
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
		ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
		ListNode l = new ListNode(8, new ListNode(9,
				new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

		assertFormatted(new Solution().addTwoNumbers(l1, l2), l);
	}

}
