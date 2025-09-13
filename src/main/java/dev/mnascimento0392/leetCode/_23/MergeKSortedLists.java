package dev.mnascimento0392.leetCode._23;

import java.util.Arrays;

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
	public ListNode mergeKLists(ListNode[] lists) {

		ListNode head = null;
		ListNode node = null;

		while (true) {
			int index = 0;
			int val = Integer.MAX_VALUE;
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null && lists[i].val < val) {
					val = lists[i].val;
					index = i;
				}
			}
			if (val == Integer.MAX_VALUE) {
				return head;
			}

			if (head == null) {
				node = new ListNode(lists[index].val);
				head = node;
			} else {
				node.next = new ListNode(lists[index].val);
				node = node.next;
			}
			lists[index] = lists[index].next;
		}
	}
}