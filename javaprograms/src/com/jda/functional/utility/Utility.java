package com.jda.functional.utility;
import java.util.Scanner;
public class Utility {
	static Scanner scn = new Scanner(System.in);
	public static String getString(){
		
		String username=scn.nextLine();
		return username;
	}
public static long getLong(){
		
		long num=scn.nextLong();
		return num;
	}
	/**
	 * scan integer
	 * @return integer
	 */
	public static int getInteger(){
		
	int num=scn.nextInt();
		return num;
	}
	public static double getDouble()
	{
		double num=scn.nextDouble();
		return num;
	}
	public static float getFloat()
	{
		float num=scn.nextFloat();
		return num;
	}
	public static int[] getOneDArray()
	{
		
		int size=scn.nextInt();
		int[]  array=new int[size];
		for(int i=0;i<size;i++)
		{
		     array[i]=scn.nextInt();
		}
		return array;
	}
	public static String[] getOneDArrayString()
	{
		
		int size=scn.nextInt();
		String[]  arrayString=new String[size];
		for(int i=0;i<size;i++)
		{
		     arrayString[i]=scn.next();
		}
		return arrayString;
	}
	
	public static int[] InsertionsortInt(int[] arr)
	{
		
		 for(int i=1;i<arr.length;i++)
		 {
			   int k=arr[i];
			   int j;
			   for(j=i-1;j>=0 && k<arr[j];j--)
					     arr[j+1]=arr[j];
			   arr[j+1]=k;
		 }
		 return arr;
	}
	public static String[] InsertionsortString(String[] arr)
	{
		
		 for(int i=1;i<arr.length;i++)
		 {
			   String str=arr[i];
			   int j=i-1;
			   //System.out.println(str.compareTo(arr[j]));
			   for(j=i-1;j>=0 && str.compareTo(arr[j])<0;j--)
			   {
					     arr[j+1]=arr[j];
					     
			   }
			   arr[j+1]=str;
		 }
		 return arr;
	}
	public static int BinarySearchInt(int[] arr, int item)
	{
		int l=0,r=arr.length-1;
		 while(l<=r)
		 {
			 int mid=l+(r-l)/2;
			 if(arr[mid]==item)
				 return mid;
			 else if(arr[mid]>item)
				 r=mid-1;
			 else
				 l=mid+1;
		 }
		 return -1;
	}
	public static boolean BinarySearchString(String [] arr, String item)
	{
		int l=0,r=arr.length-1;
		 while(l<=r)
		 {
			 int mid=l+(r-l)/2;
			 if(arr[mid].equals(item))
				 return true;
			 else if(arr[mid].compareTo(item)>0)
				 r=mid-1;
			 else
				 l=mid+1;
		 }
		 return false;
	}
	public static int[] BubblesortInt(int[] arr)
	{
		
		 for(int i=0;i<arr.length-1;i++)
		 {
			 int swap=0;
			 for(int j=0;j<arr.length-i-1;j++)
			 {
				 if(arr[j]>arr[j+1])
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 swap=1;
				 }
			 }
			 if(swap==0)
				 break;
		 }
		 return arr;
	}
	public static String[] BubblesortString(String[] arr)
	{
		
		 for(int i=0;i<arr.length-1;i++)
		 {
			 int swap=0;
			 for(int j=0;j<arr.length-i-1;j++)
			 {
				 if(arr[j].compareTo(arr[j+1])>0)
				 {
					 String temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 swap=1;
				 }
			 }
			 if(swap==0)
				 break;
		 }
		 return arr;
	}
}
