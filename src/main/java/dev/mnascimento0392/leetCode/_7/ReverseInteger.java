package dev.mnascimento0392.leetCode._7;

class Solution {
	public int reverse(int x) {

		double deep = Math.ceil(Math.log10(Math.abs(x)));
		long sum = 0;

		if (Math.log10(Math.abs(x)) - deep == 0) {
			deep++;
		}

		for (int i = 0; i < deep; i++) {
			int resto = x % 10;
			sum += resto * Math.pow(10, deep - 1 - i);
			x /= 10;
		}
		
		if(sum>Integer.MAX_VALUE || sum< Integer.MIN_VALUE) {
			return 0;
		}

		return (int)sum;
	}
}