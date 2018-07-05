package com.jda.functional.core;
import java.lang.Math;

import com.jda.functional.utility.Utility;

public class percentage_2nd {
   public static double getRandom()
   {
	   double rand=Math.random();
	   return rand;
   }
	public static void main(String[] args) {
		int num=Utility.getInteger();
		int heads=0,tails=0;
		for(int i=1;i<=num;i++)
		{
			double value=percentage_2nd.getRandom();
			if(value<0.5){
				tails++;
			}
			else{
				heads++;
			}
		}
		double head_percent=(heads/(1.0*num))*100;
		double tail_percent=(tails/(1.0*num))*100;
		System.out.println("Head Percent="+head_percent +"VS Tail Percent="+tail_percent);

	}

}
