package com.jda.functional.algorithms;

import com.jda.functional.utility.Utility;

public class VendingMachine {
	static int [] noteTypes={1000,500,100,50,10,5,2,1};
    public static void change(long money,int i,int []notes)
    {
    	
    if(money<=0){
    	
    	int t=0;
    	for(int k=0;k<8;k++)
    		t+=notes[k];
    	System.out.print("total number of Notes: "+t);    
    	System.out.println("Notes are:");
    	for(int j=0;j<8;j++)
    		System.out.println(noteTypes[j]+"*"+notes[j]+"="+noteTypes[j]*notes[j]);
    	return;
    }
    else if(money>=1000){
    	notes[0]++;
    	change(money-1000,i+1,notes);
    	
    
    }
    else if(money>=500)
    {
    	notes[1]++;
    	change(money-500,i+1,notes);
    	
    }
    else if(money>=100)
    {
    	notes[2]++;
    	change(money-100,i+1,notes);
    	
    }
    else if(money>=50){
    	notes[3]++;
    	change(money-50,i+1,notes);
    	
    }
    else if(money>=10){
    	notes[4]++;
    	change(money-10,i+1,notes);
    	
    }
    else if(money>=5){
    	notes[5]++;
    	change(money-5,i+1,notes);
    	
    }
    else if(money>=2){
    	notes[6]++;
    	change(money-2,i+1,notes);
    	
    }
    else if(money>=1){
    	notes[7]++;
    	change(money-1,i+1,notes);
    
    }
    
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the money for you want change:");
		long money=Utility.getLong();
		  int[] notes=new int[8];
		  
		  
	change(money,0,notes);

	}

}
