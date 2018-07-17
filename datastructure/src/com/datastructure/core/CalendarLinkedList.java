package com.datastructure.core;

import com.datastructure.utility.QueueLinkedList;

public class CalendarLinkedList {
	/**
	 * This method is for finding day of the week.
	 * @param m month
	 * @param d day=1
	 * @param y year
	 * @return day of the week
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
				QueueLinkedList<Integer> que=new QueueLinkedList<>();
				int j=0,k=0;
			  for(int i=0;i<=day;i++)
				  que.push(0);
				for(int i=1;i<32;i++)
				{
					 que.push(i);
				}
				System.out.println("S M T W TH F S");
				que.printCalendar(day);	
		   
	  }

}
