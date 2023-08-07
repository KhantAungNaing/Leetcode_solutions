package com.leetcode.algoritms;

public class CheckVowelsValid {

	public static void main(String[] args) {
		String[] str = { "apple", "cat", "ball", "ouu", "ai", "goat","aa","ii"};
		int count = vowelStrings(str, 0, 7);
		System.out.println(count);

	}

	public static int vowelStrings(String[] words, int left, int right) {

		char[] validCheck = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;

		for (int k = left; k <= right; k++) {

			char[] arr = words[k].toCharArray();
		
			for (int i = 0; i < validCheck.length; i++) {

				if (validCheck[i] == arr[0]) {
					for(int j = 0; j<validCheck.length;j++) {
						
						if(validCheck[j] == arr[arr.length-1]) {
							count++;
						}
					}
				}
			}

		}

		return count;
	}

}
