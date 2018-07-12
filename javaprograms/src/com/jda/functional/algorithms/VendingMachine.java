package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class VendingMachine {
    public static void change(int money,int i,int []notes)
    {
    	
    if(money<=0){
    	System.out.print("total number of Notes: "+i);
    	System.out.print("Notes are:");
    	for(int j=0;j<i;j++)
    		System.out.print(notes[j]+" ");
    	return;
    }
    else if(money>=1000){
    	notes[i]=1000;
    	change(money-1000,i+1,notes);
    	
    
    }
    else if(money>=500)
    {
    	notes[i]=500;
    	change(money-500,i+1,notes);
    	
    }
    else if(money>=100)
    {
    	notes[i]=100;
    	change(money-100,i+1,notes);
    	
    }
    else if(money>=50){
    	notes[i]=50;
    	change(money-50,i+1,notes);
    	
    }
    else if(money>=10){
    	notes[i]=10;
    	change(money-10,i+1,notes);
    	
    }
    else if(money>=5){
    	notes[i]=5;
    	change(money-5,i+1,notes);
    	
    }
    else if(money>=2){
    	notes[i]=2;
    	change(money-2,i+1,notes);
    	
    }
    else if(money>=1){
    	notes[i]=1;
    	change(money-1,i+1,notes);
    
    }
    
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the money for you want change:");
		int money=Utility.getInteger();
		  int[] notes=new int[1000];
	change(money,0,notes);

	}

}
