package dev.mnascimento0392.leetCode._25;

import java.util.ArrayList;
import java.util.List;

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
	public ListNode reverseKGroup(ListNode head, int k) {

		int count = 0;
		ListNode aux = head;
		while (aux != null) {
			count++;
			aux = aux.next;
		}

		if (count < k || k == 1) {
			return head;
		}

		ListNode resp = new ListNode(0, head);
		resp.next = reverseNextK(head, count, k);
		return resp.next;
	}

	private ListNode reverseNextK(ListNode head, int count, int k) {
		if (count < k) {
			return head;
		}

		ListNode reverted = ReverseK(head, k);
		ListNode aux = reverted;
		while (aux.next != null) {
			aux = aux.next;
			head = head.next;
		}
		aux.next = reverseNextK(head.next, count - k, k);
		return reverted;
	}

	private ListNode ReverseK(ListNode head, int k) {

		List<Integer> rev = new ArrayList<>();
		ListNode aux = head;
		for (int i = 0; i < k; i++) {
			rev.add(aux.val);
			aux = aux.next;
		}

		aux = new ListNode(0);
		ListNode aux2 = aux;
		for (int i = rev.size() - 1; i > 0; i--) {
			aux.val = rev.get(i);
			aux.next = new ListNode(0);
			aux = aux.next;
		}

		aux.val = rev.get(0);

		return aux2;
	}
}