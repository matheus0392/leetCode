package dev.mnascimento0392.leetCode._42;

class Solution {
	public int trap(int[] height) {
		int i = 0, j = height.length - 1;
		int water = 0;
		int currentLevelLeft = height[0], currentLevelRight = height[height.length - 1];
		int newMin = 0;
		while (i < j) {
			//int currentMin = newMin;
			newMin = Math.min(currentLevelLeft, currentLevelRight);
			if(newMin >0) {
			//for (int y = currentMin; y < newMin; y++) {
				for (int x = i + 1; x < j; x++) {
					if (height[x] < newMin) {
						water += newMin - /*currentMin-*/ height[x];
						height[x] = newMin;// - currentMin - height[x];
					}
				}
			//}
			}

			if (currentLevelLeft < currentLevelRight) {
				while (currentLevelLeft >= height[i]) {
					i++;
					if (i == height.length) {
						return water;
					}
				}
				currentLevelLeft = height[i];
			} else if (currentLevelLeft > currentLevelRight) {
				while (currentLevelRight >= height[j]) {
					j--;
					if (j < 0) {
						return water;
					}
				}
				currentLevelRight = height[j];
			} else {
				while (currentLevelLeft >= height[i]) {
					i++;
					if (i == height.length) {
						return water;
					}
				}
				currentLevelLeft = height[i];
				while (currentLevelRight >= height[j]) {
					j--;
					if (j < 0) {
						return water;
					}
				}
				currentLevelRight = height[j];
			}
		}
		return water;
	}
}
