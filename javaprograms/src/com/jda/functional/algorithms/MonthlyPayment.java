package com.jda.functional.algorithms;

public class MonthlyPayment {

	public static void main(String[] args) {
	int p=Integer.parseInt(args[0]);
	float R=Float.parseFloat(args[1]);
	float Year=Float.parseFloat(args[2]);
	float n=12*Year;
	float r=R/(12*100);
	float temp=(float)Math.pow((1+r),n);
	float k=1/temp;
	float payment=(p*r)/(1-k);
	System.out.println("Payment is "+payment);

	}

}
