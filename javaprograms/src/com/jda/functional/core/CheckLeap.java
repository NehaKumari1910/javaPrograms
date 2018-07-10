package com.jda.functional.core;

import com.jda.functional.utility.Utility;

public class CheckLeap {

	public static void main(String[] args) {
		int year=Utility.getInteger();
		int temp=year;
		int count=0;
		int isYear=0;
		for(int i=0;i<4;i++)
		{
			temp=temp/10;
			count++;
			if(temp==0 && count<4) 
				break;
		}
		if(temp==0 && count==4)
		{
			isYear=1;
		}
		if(isYear==1)
		{
			if(year%4==0 && year%100!=0)
			{
			  System.out.println("Leap Year");
			}
			else if(year%400==0)
			{
				  System.out.println("Leap Year");
			}
			else
				  System.out.println("Not Leap Year");	
		}
		else
			  System.out.println("Not a valid Year");

	}

}
