package com.leetcode.algoritms;

public class TwoSums {

	public static void main(String[] args) {

		int[] numsArr2 = { 3, 2, 4 };

		int[] arr = twoSum(numsArr2, 7);

		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static int[] twoSum(int[] nums, int target) {

		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					return output;
				}
			}
		}

		return null;

	}

}
