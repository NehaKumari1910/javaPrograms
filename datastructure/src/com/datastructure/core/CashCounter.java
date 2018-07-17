package com.datastructure.core;

import com.datastructure.utility.QueueLinkedList;
import com.jda.functional.utility.Utility;
/**
 * Cash Counter implementation using queue
 * @author bridgelabz
 *
 */
public class CashCounter {
   static long bankBalance=10000; //initial bankBalance
	public static void main(String[] args) {
		QueueLinkedList<Integer> que=new QueueLinkedList<>();
	   System.out.println("Enter number of person to enque:");
	   int n=Utility.getInteger();
	  for(int i=0;i<n;i++)
		  que.push(i);
	  while(!que.isEmpty())
	  {
		     System.out.println("Enter 1 to deposit cash:");
		     System.out.println("Enter 0 to withdraw cash:");
		     int check=Utility.getInteger();
		     if(check==1)
		     {
		   	     System.out.println("Enter amount to deposit:");
		   	     int amount=Utility.getInteger();
		   	     bankBalance+=amount; //depositing amount
		   	     que.pop();
		     }
		     else
		     {
		   	  System.out.println("Enter amount to withdraw:");
	   	     int amount=Utility.getInteger();
	   	     if(bankBalance>=amount)
	   	     {
	   	     bankBalance-=amount; //withdrawing amount
	   	     }
	   	     else
	   	     {
	   	   	  System.out.println("Bank has not sufficient amount");
	   	     }
	   	     que.pop();  //dequeuing person from the queue
		     }
	  }
   System.out.print("Bank Balance:"+bankBalance);
	}
}


