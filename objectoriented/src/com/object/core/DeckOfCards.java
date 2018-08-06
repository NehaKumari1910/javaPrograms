package com.object.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.object.utility.Pair;

public class DeckOfCards {
	  String [] suits={"Clubs","Diamonds","Hearts","Spades"};
     String [] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
     static Map<Integer, ArrayList<Pair> > cardsOfPlayer=new HashMap<>();
     static int [][] arr=new int[5][14];
  public static boolean isTaken(int suit,int rank)
  {
	  if(arr[suit][rank]==0)
		  return false;
	  return true;
	  
  }
	public static void main(String[] args) {
	     Random rand=new Random();
	 
	    int randRank,randSuit;
	    for(int j=0;j<9;j++)
   	 {
	   	 for(int i=0;i<4;i++)
	   	 {
	   		 while(true)
	   		 {
	   		 		randSuit=rand.nextInt(3);
	   		 		 randRank=rand.nextInt(12);
	   		 		if(!isTaken(randSuit,randRank))
	   		 			break;
	   		 		else
	   		 			System.out.println("This card is taken");
	   		 }
	   		 arr[randSuit][randRank]=i;
	   		 }
	   	 }
	    
	     for(int i=0;i<9;i++)
	     {
	   	  for(int j=0;j<4;j++)
	   	  {
	   		   if(cardsOfPlayer.containsKey(j))
	   		   {
	   		   	
	   		   	
	   		   }
	   		   else
	   		   {
	   		   	List<Pair> cards=new ArrayList<Pair>();
	   		   	
	   		   	
	   		   }
	   	  }
	   	  System.out.println();
	     }
	}	     
}
