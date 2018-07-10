package com.jda.functional.core;

import com.jda.functional.utility.Utility;

public class Harmonic {
	public static void main(String args[])
	{
		int num=Utility.getInteger();
		double harmonic=0;
		for(int i=1;i<=num;i++)
		{
			harmonic+=(1.0/i);
		}
		System.out.println(harmonic);
	}

}
