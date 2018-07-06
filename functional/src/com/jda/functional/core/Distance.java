package com.jda.functional.core;

import com.jda.functional.utility.Utility;
import java.lang.Math;

public class Distance {

	public static void main(String[] args) {
	
		System.out.println("Enter x  co-ordinate:");
		double x =Utility.getDouble();
		System.out.println("Enter y  co-ordinate:");
		double y=Utility.getDouble();
		double distance=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	   System.out.println("Distance:"+distance);
		
	}

}
