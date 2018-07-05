package com.jda.functional.utility;
import java.util.Scanner;
public class Utility {
	
	public static String getString(){
		Scanner scn = new Scanner(System.in);
		String username=scn.nextLine();
		return username;
	}
	public static int getInteger(){
		Scanner scn = new Scanner(System.in);
	int num=scn.nextInt();
		return num;
	}

}
