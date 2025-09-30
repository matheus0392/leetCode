package dev.mnascimento0392.leetCode._31;

class Solution {
	public void nextPermutation(int[] nums) {
		if (nums.length < 2) {
			return;
		}

		boolean mudou = false;
		int indexJ = -1;
		int indexI = -1;
		for (int i = nums.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] < nums[i]) {
					if (j > indexJ) {
						indexJ = j;
						indexI = i;
					}
					mudou = true;
				}
			}
		}
		if (mudou) {
			trocar(nums, indexJ, indexI);
		}

		for (int j = indexJ + 1; j < nums.length; j++) {
			for (int l = j + 1; l < nums.length; l++) {
				if (nums[j] > nums[l]) {
					trocar(nums, j, l);
					mudou = true;
					continue;
				}
			}
		}

		if (!mudou) {
			for (int j = 0; j < (nums.length) / 2; j++) {
				int aux = nums[j];
				nums[j] = nums[nums.length - 1 - j];
				nums[nums.length - 1 - j] = aux;
			}
		}
	}

	private void trocar(int[] nums, int i, int j) {
		int aux = nums[i];
		nums[i] = nums[j];
		nums[j] = aux;
	}

}