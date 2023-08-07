package com.leetcode.algoritms;

import java.util.Arrays;

public class SimpleBubbleSort {

	public static void main(String[] args) {
		int[] array = {1,5,2,9,7,8,3,2};
		int[] res = bubbleSort(array);
		System.out.println(Arrays.toString(res));

	}

	public static int[] bubbleSort(int[] inputArr) {

		int[] array = inputArr;

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}

		return array;
	}

}
