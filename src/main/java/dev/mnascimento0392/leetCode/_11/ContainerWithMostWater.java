package dev.mnascimento0392.leetCode._11;

class Solution {
	public int maxArea(int[] height) {

		int length = height.length, maxArea = 0;

		for (int x = 0, y = length - 1; x < length; x++, y--) {
			if (y <= x) {
				break;
			}
			int lower = height[x] < height[y] ? height[x] : height[y];
			int area = lower * (y - x);
			maxArea = maxArea > area ? maxArea : area;

			if (height[x] < height[y]) {
				y++;
			} else {
				x--;
			}
		}

		return maxArea;
	}
}
