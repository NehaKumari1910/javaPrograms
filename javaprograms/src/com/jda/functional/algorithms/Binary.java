package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		int num=Utility.getInteger();
		String b=Integer.toBinaryString(num);
		while(b.length()<8)
		{
			b='0'+b;
		}
		char [] arr=b.toCharArray();
		System.out.println("Before swapping nibbles:"+b);
		
		for(int i=0;i<4;i++)
		{
			char temp=arr[i];
			arr[i]=arr[4+i];
			arr[4+i]=temp;
		}
		String binarystring=String.valueOf(arr);
		System.out.println("\n After swapping nibbles:"+binarystring);
		int decimal=Integer.parseInt(binarystring,2);
		System.out.println("decimal value:"+decimal);

	}

}
