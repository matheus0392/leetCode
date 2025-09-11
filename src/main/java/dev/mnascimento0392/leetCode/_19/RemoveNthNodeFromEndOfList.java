package dev.mnascimento0392.leetCode._19;

import dev.mnascimento0392.leetCode.Definitions.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head.next == null) {
			return null;
		}

		ListNode ref = head;

		int length = 1;
		while (ref.next != null) {
			length += 1;
			ref = ref.next;
		}
		if (length - n - 1 == -1) {
			return head.next;
		}

		ref = head;
		for (int i = 0; i < length - n - 1; i++) {
			if (ref.next != null) {
				ref = ref.next;
			} else {
				return head;
			}
		}

		ListNode ref_ = ref;
		ref = ref.next;

		if (ref != null) {
			ref_.next = ref.next;
		} else {
			ref_.next = null;
		}
		return head;

	}
}