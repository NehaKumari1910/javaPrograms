package com.jda.functional.core;

import com.jda.functional.utility.Utility;
import  java.lang.Math;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a: ");
         float a=Utility.getFloat();
         System.out.print("Enter b: ");
         float b=Utility.getFloat();
         System.out.print("Enter b: ");
         float c =Utility.getFloat();
         double delta=	Math.pow(b, 2) - (4*a*c);
         double root1=((-1)*b+Math.sqrt(delta))/(2*a);
         double root2=((-1)*b-Math.sqrt(delta))/(2*a);
         System.out.println("root1: "+root1);
         System.out.println("root2: "+root2);
         
	}

}
