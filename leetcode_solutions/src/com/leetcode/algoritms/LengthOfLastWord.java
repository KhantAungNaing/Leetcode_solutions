package com.leetcode.algoritms;

public class LengthOfLastWord {

	public static void main(String[] args) {
		int value = lengthOfLastWord("a    ae                       ");
		System.out.println(value);
	}

	public static int lengthOfLastWord(String s) {

		int count = 0;
		char[] charArr = s.toCharArray();

		if (charArr.length == 1) {
			count = 1;
			return count;
		}

		for (int i = charArr.length - 1; i >= 0; i--) {
			if (charArr[i] != ' ') {
				count++;

				if (i == 0) {
					return count;
				}

				if (charArr[i - 1] == ' ') {
					break;
				}
			}

		}

		return count;
	}
}
