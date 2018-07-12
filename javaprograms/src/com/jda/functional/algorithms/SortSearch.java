package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class SortSearch {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter 1 for Insertion sort for Integer");
			System.out.println("Enter 2 for Insertion sort for String");
			System.out.println("Enter 3 for Binary search for Integer");
			System.out.println("Enter 4 for Binary search for String");
			System.out.println("Enter 5 for Bubble sort for Integer");
			System.out.println("Enter 6 for Bubble sort for String");
			System.out.println("Enter -1 to quit.");

			int check = Utility.getInteger();
			System.out.println(check);
			if (check == -1)
				break;
			switch (check) {
			case 1:
				System.out.println("Enter size of the integer array and elements of array:");
				int[] arr1 = Utility.getOneDArray();
				long startTime=System.currentTimeMillis();
				int[] sortedArr = Utility.InsertionsortInt(arr1);
				long elapsedTime=System.currentTimeMillis()-startTime;
				System.out.println("Time take by insertion sort is :"+elapsedTime);
				for (int i = 0; i < sortedArr.length; i++) {
					System.out.println(sortedArr[i]);
				}
				break;
			case 2:
				System.out.println("Enter size of the integer array and elements of array:");
				String[] arr = Utility.getOneDArrayString();
				String[] sortedArr2 = Utility.InsertionsortString(arr);
				for (int i = 0; i < sortedArr2.length; i++) {
					System.out.println(sortedArr2[i]);
				}
				break;
			case 3:
				System.out.println("Enter size of the integer array and elements of array:");
				int[] arr2 = Utility.getOneDArray();
			
				int[] sortedArr1 = Utility.InsertionsortInt(arr2);
				System.out.println("Enter element to be searched:");
				int item = Utility.getInteger();
				long startTime1=System.currentTimeMillis();
				int idx = Utility.BinarySearchInt(sortedArr1, item);
				long elapsedTime1=System.currentTimeMillis()-startTime1;
				System.out.println("Time take by Binary search is :"+elapsedTime1);
				if (idx != -1)
					System.out.println("Item found " + idx);
				else
					System.out.println("Item not found");
				break;
			case 4:
				System.out.println("Enter size of the string array and elements of array:");
				String[] arr3 = Utility.getOneDArrayString();
				String[] sortedArr3 = Utility.InsertionsortString(arr3);

				for (int i = 0; i < sortedArr3.length; i++) {
					System.out.println(sortedArr3[i]);
				}
				System.out.println("Enter element to be searched:");
				Utility.getString();
				String item2 = Utility.getString();
				long startTime2=System.currentTimeMillis();
				boolean flag = Utility.BinarySearchString(sortedArr3, item2);
				
				long elapsedTime2=System.currentTimeMillis()-startTime2;
				System.out.println("Time take by insertion sort is :"+elapsedTime2);
				if (flag == true)
					System.out.println("Item found ");
				else
					System.out.println("Item not found");
				break;
			case 5:
				System.out.println("Enter size of the integer array and elements of array:");
				int[] arr4 = Utility.getOneDArray();
				long startTime3=System.currentTimeMillis();
				int[] sortedArr5 = Utility.BubblesortInt(arr4);
				long elapsedTime3=System.currentTimeMillis()-startTime3;
				System.out.println("Time take by insertion sort is :"+elapsedTime3);
				for (int i = 0; i < sortedArr5.length; i++) {
					System.out.println(sortedArr5[i]);
				}
				break;
			case 6:
				System.out.println("Enter size of the integer array and elements of array:");
				String[] arr5 = Utility.getOneDArrayString();
				long startTime4=System.currentTimeMillis();
				String[] sortedArr6 = Utility.BubblesortString(arr5);
				long elapsedTime4=System.currentTimeMillis()-startTime4;
				System.out.println("Time take by insertion sort is :"+elapsedTime4);
				for (int i = 0; i < sortedArr6.length; i++) {
					System.out.println(sortedArr6[i]);
				}
				break;
			default:
				break;

			}

		}

	}
}
