package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class FindNumber {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		//int n = (int) (Math.log(N) / Math.log(2));
		int l = 0, h = N, mid = 0;
		int flag = 0;
		while(l<=h)
		{
			mid=(l+h)/2;
			System.out.println("is your number "+mid);
			flag=Utility.getInteger();
			if(flag==1)
			{
				System.out.println("your number is "+mid);
				break;
			}
			else
			{
				
				  System.out.println("Your number is less than "+mid);
				  int f=Utility.getInteger();
				  if(f==1)
					  h=mid-1;
				  else
					  l=mid+1;
				  
			}
			
		}
			
	}

}
