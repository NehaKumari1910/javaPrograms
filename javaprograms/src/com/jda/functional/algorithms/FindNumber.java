package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class FindNumber {

	public static void main(String[] args) {
	int N=Integer.parseInt(args[0]);
	int n=(int) (Math.log(N)/Math.log(2));
	int l=0,h=N,mid=0;
	while(n!=0)
	{
		mid=(l+h)/2;
		System.out.println("Your number is equal to "+(mid)+"?");
		int flag=Utility.getInteger();
		if(flag==1)
			System.out.println("Your number is "+mid);
		else{
		System.out.println("Your number is in range "+l+"-"+(mid));
 flag=Utility.getInteger();
		if(flag==1)
		     h=mid-1;
		else
			l=mid+1;
		n--;
		}
	}
	

	}

}
