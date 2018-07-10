package com.jda.functional.core;

import com.jda.functional.utility.Utility;

public class StringPermutaion {
	public static String swap(String input, int i, int j) {
		char[] arr = input.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

	public static void permuteRecursive(String input, int l, int r) {
		if (l == r) {
			System.out.println(input);
		} 
		else 
		{
			for (int i = l; i <= r; i++) {
				input = StringPermutaion.swap(input, i, l);
				permuteRecursive(input, l + 1, r);
				input = StringPermutaion.swap(input, i, l);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		String inputString = Utility.getString();
		permuteRecursive(inputString, 0, inputString.length() - 1);

	}

}
