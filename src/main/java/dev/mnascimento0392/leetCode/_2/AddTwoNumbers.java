package dev.mnascimento0392.leetCode._2;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode root = new ListNode(0);
        ListNode list = root;

        do {

            list.val = list.val + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            if (list.val >= 10) {
                list.val -= 10;
                list.next = new ListNode(1);
            } else {
                if (l1 != null || l2 != null)
                    list.next = new ListNode(0);
            }
            list = list.next;
        } while (l1 != null || l2 != null);

        return root;
    }
}