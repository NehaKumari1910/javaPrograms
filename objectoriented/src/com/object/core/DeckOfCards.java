package com.object.core;

import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {
	     String [] suits={"Clubs","Diamonds","Hearts","Spades"};
	     String [] rank={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	     Random rand=new Random();
	    int [][] arr=new int[5][5];
	    int j=0,k=0;
	     for(int i=0;i<8;i++)
	     {
	   	  int randSuit=rand.nextInt(3);
		     int randRank=rand.nextInt(12);
		     arr[k][j]=randSuit;
		     arr[k][j+1]=randRank;
		     k++;
		     if(k==4)
		     {
		   	  k=0;
		   	  j+=2;
		     }
	     }
	     for(int i=0;i<4;i++)
	     {
	   	  for(int j1=0;j1<4;j1+=2)
	   	  {
	   		  	System.out.print(i+"->"+suits[arr[i][j1]]+" ");
	   			System.out.print("{"+rank[arr[i][j1+1]]+"}  ");
	   	  }
	   	  System.out.println();
	     }
	}	     
}
