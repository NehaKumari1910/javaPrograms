package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class ToBinary {

	public static void main(String[] args) {
		System.out.println("Enter an Integer:");
		int num=Utility.getInteger();
		int[]  binary=new int[1000];
		int i=0;
		while(num>0)
		{
			binary[i++]=num%2;
			num=num/2;
		}
		System.out.print("Binay representation:");
		for(int j=i-1;j>=0;j--)
			System.out.print(binary[j]);
	}

}
