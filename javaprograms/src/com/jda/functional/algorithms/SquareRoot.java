package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println("Enter an number:");
		int num=Utility.getInteger();
		float epsilon=(float) (1/(Math.pow(2.71, 15)));
	float temp=num;
		while(Math.abs(temp-num/temp)>epsilon*temp)
		{
		      temp=(temp+num/temp)/2;
		}
       System.out.println(temp);
	}

}
