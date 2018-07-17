package com.datastructure.core;

import java.util.ArrayList;
import java.util.List;

import com.datastructure.utility.QueueLinkedList;
import com.datastructure.utility.StackLinkedList;

public class PrimeNumbers {
	/**
	 * This method is checking either two strings are anagrams 
	  or not.
	 * @param str1 first string
	 * @param str2 second string
	 * @return
	 */
	public static boolean checkAnagram(String str1,String str2)
	{
		if(str1.length()==str2.length())
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
				return true;
		}
		return false;	
	}
	/**
	 * This method is for printing anagrams and while printing it is also 
	 pushing to the stack and queue.
	 * @param prime 2d array of prime number
	 * @param length arr containing the length of subarrays
	 */
	public static void printAnagrams(int[][] prime,int []length)
	{
		StackLinkedList<Integer> stk=new StackLinkedList<>();
		QueueLinkedList<Integer> que=new QueueLinkedList<>();
		int [][]anagrams=new int[10][34];
		int []len=new int[10];
		int k=0;
		for(int row=0;row<10;row++)
		{
			int c=0;
				for(int i=0;i<length[row];i++)
				{
					String str1=Integer.toString(prime[row][i]);
					for(int j=i+1;j<length[row];j++)
					{
						String str2=Integer.toString(prime[row][j]);
						if(checkAnagram(str1,str2))
						{
							  anagrams[row][c++]=Integer.parseInt(str1);
							  anagrams[row][c++]=Integer.parseInt(str2);
						}
					}
				}
				len[k++]=c;
		}
		for(int row=0;row<10;row++)
		{
			if(len[row]>0){
				for(int i=0;i<len[row];i++)
				{
						System.out.print(anagrams[row][i]+" ");
							stk.push(anagrams[row][i]);
							que.push(anagrams[row][i]);
				}
				System.out.println();
			}	
		}
		System.out.println("Anagrams in reverse order using stack:");
		stk.printList();
		System.out.println("Anagrams in from queue:");
		que.printList();
	}				
	public static void main(String[] args) {
		System.out.println("Prime numbers in range 0 to 1000 are:");
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
		int [][] prime=new int[10][100];
		int j=0,c=0;
		int k=2;
		int []length=new int [10];
		
for(int i=k;i<=(j+1)*100 && i<=1000;i++)
		{
	         if(arr[i]==0)
	         {
			         prime[j][c++]=i;
			       
	         }
	         if(i==(j+1)*100)
	         {
	         	length[j]=c;
	         	j++;
	         	k=j*100+1;
	         	c=0;
	         }
		}
  
    for(int i=0;i<10;i++)
    {
   	 for( j=0;j<length[i];j++)
   	 {
   		 System.out.print(prime[i][j]+" ");
   	 }
   	 System.out.println();
    }
    System.out.println("Anagrams in range 0 to 1000 are:");
    printAnagrams(prime,length);
	}

}
