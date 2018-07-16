/**
 * 
 */
package com.datastructure.core;

import com.datastructure.utility.Dequeue;
import com.jda.functional.utility.Utility;

/**
 * @author bridgelabz
 *
 */
public class PalindromeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Enter size of the array:");
		int size=Utility.getInteger();
		Dequeue  dq= new Dequeue(size);
		System.out.println("Enter elements of the array:");
		for(int i=0;i<size;i++)
		{
			int input=Utility.getInteger();
			dq.addRear(input);
		}
		int f=0;
		while(!dq.isEmpty())
		{
			if(dq.getFront()==dq.getRear())
			{
				dq.removeFront();
				if(!dq.isEmpty())
					dq.removeRear();
			}
			else{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("Palinddrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
