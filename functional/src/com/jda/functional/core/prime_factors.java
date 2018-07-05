package com.jda.functional.core;

import com.jda.functional.utility.Utility;
import java.lang.Math;

public class prime_factors {

	public static int checkPrime(int  num)
	{
		double root=Math.sqrt(num);
		for(int i=2;i<=root;i++)
		{
			if(num%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
	       int input=Utility.getInteger();
	       for(int i=2;i<(input/2);i++)
	       {
	    	    if(input%i==0)
	    	    {
	    	    	int isPrime=checkPrime(i);
	    	        if(isPrime==1)
	    	        	System.out.println(i);
	    	    }
	       }

	}

}
