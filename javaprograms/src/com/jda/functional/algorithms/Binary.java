package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class Binary {
	/**
	 * 
	 * @param i -index of  nibbles
	 * @param j
	 * @param arr-character array of bits
	 * @return String formed after swapping the bits
	 */
    public static String swap(int i,int j,char[] arr)
    {
    	//System.out.println("i and  j"+i+j);
    	for(int k=i*4;k<(i*4)+4;k++)
    	{
    		char temp=arr[k];
    		arr[k]=arr[k+4*(j-i)];
    		arr[k+4*(j-i)]=temp;
    	}
    	String binarystring=String.valueOf(arr);
    	return binarystring;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		int num=Utility.getInteger();
		String b=Integer.toBinaryString(num);
		while(b.length()<32)
		{
			b='0'+b;
		}
		
		
		System.out.println("Before swapping nibbles:"+b);
		
		for(int i=0;i<8;i++)
		{
			
			for(int j=i+1;j<8;j++)
			{
				char [] arr=b.toCharArray();
				String swapped=swap(i,j,arr);
				System.out.println("\n After swapping nibbles:"+swapped);
				int decimal=Integer.parseInt(swapped,2);
				System.out.println("decimal value:"+decimal);
			}
			
		}
		
		
		

	}

}
