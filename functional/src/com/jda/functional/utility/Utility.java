package com.jda.functional.utility;
import java.util.Scanner;
public class Utility {
	static Scanner scn = new Scanner(System.in);
	public static String getString(){
		
		String username=scn.nextLine();
		return username;
	}
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

}
