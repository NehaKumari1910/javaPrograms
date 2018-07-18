package com.datastructure.core;
import com.datastructure.utility.StackLinkedList;

public class QueueUsingStack {
	/**
	 * This method is for calculating the day of the week.
	 * @param m month
	 * @param d date=1
	 * @param y year
	 * @return day of week
	 */
		public static int dayOfWeek(int m,int d,int y)
	   {
	   	int y0=y-(14-m)/12;
			int x=y0+y0/4-y0/100+y0/400;
			int m0=m+12*((14-m)/12)-2;
			int d0=(d+x+(31*m0)/12)%7;
			return d0;
	   }
		  public static void main(String [] args)
		  {  
			  int month=Integer.parseInt(args[0]);
				int year=Integer.parseInt(args[1]);
				  int day=dayOfWeek(month,1,year);
					System.out.println("Day of Week is "+day+".");
					StackLinkedList<Integer> stk1=new StackLinkedList<>();
					StackLinkedList<Integer> stk2=new StackLinkedList<>();
					int j=0,k=0;
				  for(int i=0;i<=day;i++)
					  stk1.push(0);
					for(int i=1;i<32;i++)
					{
						 stk1.push(i);
					}
					System.out.println("S M T W TH F S");
					while(!stk1.isEmpty())
					{
						int num=stk1.getTop();
						  stk2.push(num);
						  stk1.pop();
					}
							stk2.printCalendar(day);	
			   
		  }


	}


