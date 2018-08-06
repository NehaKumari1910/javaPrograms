package com.jda.core;

import com.jda.utility.Utility;

/**
 * @author 1022783
 *
 */
public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Enter number of rows:");
		int rows=Utility.getInt();
		System.out.println("Enter number of columns:");
		int cols=Utility.getInt();
		String[][] arr=new String[rows][cols];
		System.out.println("Enter elements of array:");
		for(int row=0;row<rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				String str=Utility.getstring();
				arr[row][col]=str;
			}
		}
		for(int row=0;row<rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

	}

}
