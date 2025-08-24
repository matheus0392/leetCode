package dev.mnascimento0392.leetCode._wc463q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public int gcdOfOddEvenSums(int n) {
		int sumOdd = 0, sumEven = 0;

		for (int x = 1; x <= n * 2; x++) {
			if (x % 2 == 0) {
				sumEven += x;

			} else {
				sumOdd += x;
			}
		}

		return GCD(sumOdd, sumEven);

	}

	int GCD(int a, int b) {
		int smaller = a < b ? a : b;
		for (int x = smaller; x > 0; x--) {
			if (a % x == 0 && b % x == 0) {
				return x;
			}
		}

		return smaller;
	}

}