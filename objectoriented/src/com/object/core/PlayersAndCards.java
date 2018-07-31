package com.object.core;

import java.util.Random;

import com.datastructure.utility.QueueLinkedList;
import com.jda.functional.utility.Utility;
import com.object.utility.Player;



public class PlayersAndCards {

	public static void main (String[] args) {
	//Player ply=new Player();
		QueueLinkedList<Player> que=new QueueLinkedList<>();
		String [] suits={"Clubs","Diamonds","Hearts","Spades"};
	     String [] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	     Random rand=new Random();
		while(true)
		{
			System.out.println("Enter 1 to add player to queue");
			System.out.println("Enter 0 to quit");
			int check=Utility.getInteger();
			if(check==1)
			{
				int randSuit=rand.nextInt(3);
			   int randRank=rand.nextInt(12);
				Player plyr=new Player();
				plyr.setSuit(suits[randSuit]);
				plyr.setRank(ranks[randRank]);
				que.push(plyr);
			}
			else
				break;
		}
		Player ply;
		int i=1;
		while(!que.isEmpty())
		{
           ply=que.dequeue();
         System.out.println("Player"+i+"=>"+ply.getSuit()+"  "+ply.getRank());
         i++;
		}

	}

}
