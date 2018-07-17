package com.datastructure.core;

import com.jda.functional.utility.Utility;

public class NumberOfBinarySearchTree {
	/**
	 * This method is for finding total number of binary search tree having 
	 * node n.
	 * @param n number of nodes
	 * @return 
	 */
    public static long catalanDp(int n)
    {
   	 long [] arr=new long[n+1];
   	 arr[0]=1;
   	 arr[1]=1;
   	 for(int i=2;i<=n;i++)
   	 {
   		 arr[i]=0;
   		 for(int j=0;j<i;j++)
   		 {
   			 arr[i]+=arr[j]*arr[i-j-1];
   		 }
   	 }
   	 return arr[n];
    }
	public static void main(String[] args) {
		System.out.println("Enter the number of nodes:");
		int n=Utility.getInteger();
		long catalan=catalanDp(n);
     System.out.println("Number of binary search tree with n nodes = " +catalan);
	}

}
