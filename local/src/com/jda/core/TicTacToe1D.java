package com.jda.core;

import com.jda.utility.Utility;
import java.util.Random;

public class TicTacToe1D
{
	public static boolean checkEmptyCell(int[] arr)
	{
		for(int i=0;i<9;i++)
		{
				if(arr[i]==-1)
					return true;
		}
		return false;
	}
	public static boolean checkOccupied(int[] arr,int idx)
	{
		if(arr[idx]==-1)
			return false;
		return true;
	}
    public static boolean checkRow(int[] arr)
    {
    	for(int i=0;i<=6;i+=3)
    	{
    		if(arr[i]==1 && arr[i+1]==1 && arr[i+2]==1)
    			return true;
    		else if(arr[i]==0 && arr[i+1]==0 && arr[i+2]==0)
    			return true;
    	}
    	return false;

    }
    public static boolean checkColumn(int[] arr)
    {
    	for(int i=0;i<3;i++)
    	{
    		if(arr[i]==1 && arr[i+3]==1 && arr[i+6]==1)
    			return true;
    		else if(arr[i]==0 && arr[i+3]==0 && arr[i+6]==0)
    			return true;
    	}
    	return false;

    }
    public static boolean checkDiagonal(int[] arr)
    {
    	
    	if((arr[0]==1 && arr[4]==1 && arr[8]==1)||(arr[0]==1 && arr[4]==1 && arr[8]==1))
    		return true;
    	else if((arr[2]==0 && arr[4]==0 && arr[6]==0)||(arr[2]==0 && arr[4]==0 && arr[6]==0))
    		return true;
    	else
    		return false;
    }
	public static void main(String[] args) {
		//int size=Utility.getInt();
		int[] arr=new int[9];
		for(int i=0;i<9;i++)
		{
				arr[i]=-1;
		}
		Random rand=new Random();
		int comp_turn=1;
		int cnt=0;
		for(int i=0;i<9;i++)
		{
			System.out.print(arr[i]+" ");
			cnt++;
			if(cnt==3) 
			{
				System.out.println();
				cnt=0;
			}
		}
		while(true)
		{
			if(comp_turn==1) 
			{
				//System.out.println("its computer's turn:");
				if(!checkRow(arr) && !checkColumn(arr)&& !checkDiagonal(arr)
						&& checkEmptyCell(arr))
				{
					   while(true)
					   {
						   int randIdx=rand.nextInt(9);
						   System.out.println("compCell:"+randIdx);
						   if(!checkOccupied(arr,randIdx))
						   {
							   arr[randIdx]=0;
							   break;
						   }
					   }
					  
				}
				else
				{
					
					break;
				}
				 comp_turn=0;
			}
			else
			{
				
				if(!checkRow(arr)&& !checkColumn(arr)&& !checkDiagonal(arr) && checkEmptyCell(arr))
				{
					System.out.println("Hey User,its your turn:");
					int idx=Utility.getInt();
					
					if(checkOccupied(arr,idx)==false)
					{
						arr[idx]=1;
					}
				}
				else
				{
					
					break;
				}
				comp_turn=1;
			}
			int c=0;
			for(int i=0;i<9;i++)
			{
					System.out.print(arr[i]+" ");
					c++;
				if(c==3)
				{
					System.out.println();
					c=0;
				}
			}
		}
		if(checkRow(arr)|| checkColumn(arr)|| checkDiagonal(arr))
		{
			if(comp_turn==0)
				System.out.println("Computer won the game!!");
			else
				System.out.println("User won the game!!");
		}
		else if(!checkEmptyCell(arr))
			System.out.println("Draw!!");

	}

}
