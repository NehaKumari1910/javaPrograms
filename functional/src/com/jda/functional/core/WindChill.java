package com.jda.functional.core;

import com.jda.functional.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Temprature(in Fahrenhiet) between range 0 to 50");
		double temp=Utility.getDouble();
		System.out.println("Enter speed in miles/hour and speed must be greater than 3 and less than 120");
		double speed=Utility.getDouble();
		double WindChill=35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(speed, 0.16);
		System.out.println("WindChill value"+WindChill);
		
		
	

	}

}
