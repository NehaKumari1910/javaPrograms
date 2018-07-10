package com.jda.functional.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jda.functional.utility.Utility;
public class Coupon_Numbers {

	public static void main(String[] args) {
		System.out.println("Enter Number of Coupon:");
		int size=Utility.getInteger();
		List<Integer> coupons=new ArrayList<>(size);
		Random rand=new Random();
		int count=0;
		int range=size;
		while(size>0)
		{
			      int randInt=rand.nextInt(range*100);
			      boolean check=coupons.contains(randInt);
                    if(check==false)
                    {
                    	coupons.add(randInt);
                    	System.out.println(randInt);
                    	size--;
                    }
                    count++;
		}
		System.out.println("total random numbers generted for distinct coupons is :"+count);
		

		

	}

}
