package dev.mnascimento0392.leetCode._wc463q1;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public long maxProfit(int[] prices, int[] strategy, int k) {

		int length = prices.length;
		long max = 0;
		Integer[] stra = new Integer[length];
		Integer[] kArray = new Integer[k];

		int[] initialProfit = new int[length];

		for (int x = 0; x < length; x++)
			stra[x] = strategy[x];

		for (int x = 0; x < k / 2; x++)
			kArray[x] = 0;

		for (int x = k / 2; x < k; x++)
			kArray[x] = 1;

		for (int x = 0; x < length; x++)
			initialProfit[x] = prices[x] * strategy[x];

		int index = -1;
		long diff = 0;

		long sum_ = 0;
		long sum__ = 0;
		for (int y = 0; y < k; y++) {
			sum_ += initialProfit[y];
			sum__ += kArray[y] == 0 ? 0 : (kArray[y] == 1 ? prices[y] : -prices[y]);
		}
		if (sum__ - sum_ > diff) {
			diff = sum__ - sum_;
			index = 0;
		}

		for (int x = 0; x < length - k; x++) {
			sum_ += (-initialProfit[x] + initialProfit[x + k]);
			sum__ += (-prices[x + k / 2] + prices[x + k]);
			if (sum__ - sum_ > diff) {
				diff = sum__ - sum_;
				index = x + 1;
			}
		}

		if (index >= 0) {
			Integer[] stra2 = getSequence(stra, index, k);
			max = profitCalculation(prices, stra2);
		} else {
			max = profitCalculation(prices, stra);
		}

		return max;
	}

	Integer[] getSequence(Integer[] strategy, int index, int k) {

		List<Integer> list = new ArrayList<>();
		for (int x = 0; x < strategy.length; x++) {
			list.add(strategy[x]);
		}

		for (int x = 0; x < k / 2; x++) {
			list.set(index + x, 0);
			list.set(index + x + k / 2, 1);
		}

		return list.toArray(Integer[]::new);
	}

	long profitCalculation(int[] prices, Integer[] strategy) {

		long sum = 0;

		for (int x = 0; x < prices.length; x++) {
			sum += prices[x] * strategy[x];
		}

		return sum;
	}
}
