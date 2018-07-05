package com.jda.functional.core;

import com.jda.functional.utility.Utility;

public class Power_of_2 {
	public static void main(String args[])
	{
		int num=Utility.getInteger();
		int p=1;
		for(int i=1;i<num;i++)
		{
			 p=p*2;
			System.out.println(p);
		}
	}

}
