package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class TempratureConversion {

	public static void main(String[] args) {
		System.out.println("Enter unit in celcius or farhenheit like c or f respectively:");
		String unit=Utility.getString();
		System.out.println("Enter temprature:");
	    float temp=Utility.getFloat();
		if(unit.equals("c"))
		{
			temp=temp*(9/5)+32;
			System.out.println("temprature in F is "+temp+"F");
		}
		else
		{
			temp=((temp-32)*5)/9;
			System.out.println("temprature in C is "+temp+"C");
		}

	}

}
