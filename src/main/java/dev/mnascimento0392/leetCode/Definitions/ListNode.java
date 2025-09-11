package dev.mnascimento0392.leetCode.Definitions;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Definition for singly-linked list.
 */
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class ListNode {
	public int val;
	public ListNode next;

	ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public ListNode(int... vals) {
		this.val = vals[0];

		if (vals.length == 1) {
			return;
		}

		int[] subVals = new int[vals.length - 1];
		for (int x = 0; x < vals.length - 1; x++) {
			subVals[x] = vals[x + 1];
		}

		next = new ListNode(subVals);
	}

}
