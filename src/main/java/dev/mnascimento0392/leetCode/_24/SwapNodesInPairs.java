package dev.mnascimento0392.leetCode._24;

import dev.mnascimento0392.leetCode.Definitions.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode resp = new ListNode(0);
		resp.next = head;

		ListNode tempHead = resp;
		ListNode aux = head;

		for (int i = 0; i < 100; i++) {
			if (aux == null || aux.next == null) {
				return resp.next;
			}

			if (i % 2 == 0) {
				ListNode aux2 = aux.next;
				aux.next = aux.next.next;
				aux2.next = aux;
				tempHead.next = aux2;
				aux = aux.next;
			}

			tempHead = tempHead.next;
		}

		return resp.next;
	}
}