package com.jda.functional.algorithms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.jda.functional.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) throws Exception {
		File file1 = new File(
				"/home/bridgelabz/Javaprograms/Functional_programs/javaprograms/src/com/jda/functional/algorithms/file2.txt");
		BufferedReader br = new BufferedReader(new FileReader(file1));
		String st;
		String str = "";
		while ((st = br.readLine()) != null) {

			str = str + st + " ";
		}
		br.close();
		System.out.println(str);
		String[] arr = str.split(" ");
		// System.out.println(arr.length);
		int[] a = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			a[i] = Integer.parseInt(arr[i]);
			// System.out.println(a[i]);
		}
		int[] sortedArr = Utility.BubblesortInt(a);
		System.out.println("Sorted array:");
		for (int i = 0; i < arr.length; i++)
			System.out.println(sortedArr[i] + " ");

	}

}
