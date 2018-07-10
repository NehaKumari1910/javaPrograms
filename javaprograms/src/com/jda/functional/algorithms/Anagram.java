package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;
import java.util.ArrayList;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter first string:");

		String str1 = Utility.getString();
		str1 = str1.toLowerCase();
		System.out.println("Enter second string:");
		String str2 = Utility.getString();
		str2 = str2.toLowerCase();
		if (str1.length() == str2.length()) {

			List<Character> arr = new ArrayList<>(str1.length());
			char[] charArr1 = str1.toCharArray();
			char[] charArr2 = str2.toCharArray();
			for (int i = 0; i < str1.length(); i++) {
				arr.add(charArr1[i]);
			}
			int cnt = 0;
			for (int i = 0; i < str2.length(); i++) {
				if (arr.contains(charArr2[i])) {
					arr.remove(new Character(charArr2[i]));
					cnt++;
				}
			}
			if (cnt == str1.length())
				System.out.println("Anagram");
			else
				System.out.println("not an Anagram");
		} else {
			System.out.println("not an Anagram");
		}

	}

}
