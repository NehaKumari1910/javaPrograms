package com.jda.functional.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	public static void checkAnagram(String str1,String str2)
	{
		

			List<Character> arr = new ArrayList<>(str1.length());
			char[] charArr1 = str1.toCharArray();
			char[] charArr2 = str2.toCharArray();
			for (int i = 0; i < str1.length(); i++) {
				arr.add(charArr1[i]);
			}
			int cnt = 0;
			for (int i = 0; i < str2.length(); i++) {
				if (arr.contains(charArr2[i])) {
					arr.remove(new Character(charArr2[i]));
					cnt++;
				}
			}
			if (cnt == str1.length())
				System.out.println("Anagram:"+str1+"and "+str2);
	}
	public static void printAnagrams(int[] prime,int c)
	{
		
		for(int i=4;i<c;i++)
		{
			int flag=0;
			if(prime[i]/100==0)
				flag=1;
			String str1=Integer.toString(prime[i]);
			for(int j=i+1;j<c;j++)
			{
				if(flag==1 && prime[j]/100>0)
					break;
				
				String str2=Integer.toString(prime[j]);
				checkAnagram(str1,str2);
				
			}
				
		}
	}
    public static void printPalindrome(int [] prime,int c)
    {
    	System.out.println("\nprime numbers which are palindome.");
    	for(int i=4;i<c;i++)
    	{
    		String num=Integer.toString(prime[i]);
    		char[] numArr=num.toCharArray();
    		String reverse="";
    		for(int j=numArr.length-1;j>=0;j--)
    		{
    			reverse=reverse+numArr[j];
    		}
    		
    		if(num.equals(reverse))
    			System.out.print(prime[i]+" ");
    	}
    }
	public static void main(String[] args) {
		
		int [] arr=new int [1000+1];
		
		for(int i=2;i*i<=1000;i++)
		{
			if(arr[i]==0){
				for(int j=i*2;j<=1000;j+=i)
				{
					arr[j]=1;
				}
			}
		}
		int c=0;
		int [] prime=new int[200];
for(int i=2;i<=1000;i++)
		{
	         if(arr[i]==0){
			System.out.print(i+" ");
			prime[c++]=i;
	         
	         }
		}
		System.out.println();
		System.out.print("Total prime numbers between 1 to 1000 is "+c+".");
		
		printPalindrome(prime,c);
		printAnagrams(prime,c);

	}

}
