package dev.mnascimento0392.leetCode._6;

class Solution {
	public String convert(String s, int numRows) {

		StringBuilder sb = new StringBuilder();
		int[] aux = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			aux[i] = calculateLine(i, numRows-1);
		}

		for (int j = 0; j < numRows; j++) {
			for (int i = 0; i < s.length(); i++) {
				if (aux[i] == j) {
					sb.append(s.charAt(i));
				}
			}
		}
		return sb.toString();
	}

	int calculateLine(int indx, int numRows) {
		if(numRows == 0) {
			return 0;
		}
		
		if ((indx / numRows) % 2 == 0) {
			return indx % numRows;
		}
		return numRows - indx % numRows;
	}
}
