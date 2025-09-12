package dev.mnascimento0392.leetCode._21;

import dev.mnascimento0392.leetCode.Definitions.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}

		ListNode head1 = list1;
		ListNode head2 = list2;
		int size = 0;
		while (list1 != null) {
			list1 = list1.next;
			size++;
		}
		while (list2 != null) {
			list2 = list2.next;
			size++;
		}

		ListNode resp = new ListNode();
		ListNode head = resp;
		for (int i = 0; i < size; i++) {
			if (head1 != null && head2 != null) {
				if (head1.val < head2.val) {
					resp.val = head1.val;
					head1 = head1.next;
				} else {
					resp.val = head2.val;
					head2 = head2.next;
				}
				resp.next = new ListNode();
				resp = resp.next;
			}
			if (head1 == null) {
				resp.val = head2.val;
				resp.next = head2.next;
				break;
			}
			if (head2 == null) {
				resp.val = head1.val;
				resp.next = head1.next;
				break;
			}
		}

		return head;
	}
}