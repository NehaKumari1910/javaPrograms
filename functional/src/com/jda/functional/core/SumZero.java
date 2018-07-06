package com.jda.functional.core;

import com.jda.functional.utility.Utility;
import java.util.ArrayList;

public class SumZero {

	public static void main(String[] args) {
		
		System.out.println("Enter size and elements of array:");
		int[]  nums=Utility.getOneDArray();
		ArrayList<Integer> triplets=new ArrayList<Integer>(nums.length);
		for (int  i=0;i<nums.length-2;i++)
		{
			for(int j=i+1;j<nums.length-1;j++)
			{
				for(int k=i+2;k<nums.length;k++)
				{
					if(nums[i]+nums[j]+nums[k]==0)
					{
						triplets.add(nums[i]);
						triplets.add(nums[j]);
						triplets.add(nums[k]);
					}
				}
			}
		}
			System.out.println("number of triplets:"+triplets.size()/3);
			int count=0;
			for(int triplet:triplets)
			{
				System.out.print(triplet+" ");
				count++;
				if(count==3)
				{
					count=0;
					System.out.println();
					
				}
			}
		
		
		

	}

}
