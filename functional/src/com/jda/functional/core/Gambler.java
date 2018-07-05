package com.jda.functional.core;

import com.jda.functional.utility.Utility;
import java.lang.Math;

public class Gambler {

	public static void main(String[] args) {
		System.out.println("Enter initial amount:");
		int initial_amount=Utility.getInteger();
		System.out.println("Enter Goal amount:");
		int goal_amount=Utility.getInteger();
		System.out.println("Enter Number of times:");
		int num=Utility.getInteger();
		
		int win=0,loose=0;
		int betwin=0,betloose=0;
		for(int i=1;i<=num;i++)
		{
			int current_amount=initial_amount;
			while(true)
			{
				double rand=Math.random();
				if(rand<0.5)
				{
					current_amount++;
					betwin++;
				}
				else
				{
					betloose++;
					current_amount--;
				}
				if(current_amount==0)
				{
					loose++;
					break;
				}
				else if(current_amount==goal_amount)
				{
					win++;
					break;
				}
					
			}
		}
		
System.out.println("betsWin: "+betwin);
System.out.println("betsLoose: "+betloose);
System.out.println("gamesWin: "+win);
System.out.println("gamesLoose: "+loose);
System.out.println("averageWin: "+(betwin/num));
System.out.println("averageLoose: "+(betloose/num));
	}

}
