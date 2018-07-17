package com.datastructure.utility;
public class Stack
{
	 	static final int MAX = 1000;
	    int top=-1;
	    char stk[] = new char[MAX]; // Maximum size of Stack
	    public void push(char item)
		{
			if(top>=MAX)
			{
				System.out.println("Stack Overflow");
				return;
			}
			stk[++top]=item;
			return;
		}
	   public char pop()
		{
			if(top<=-1)
			{
				System.out.println("Stack Underflow");
				return '0';
			}
			char item=stk[top--];
			return item;
			
		}
	    public boolean isEmpty()
	    {
	   	 return top<0;
	    }
	    public int size()
	    {
	    		return stk.length;
	    }
	    public char getPeek()
	    {
	   	 return stk[top];
	    }
	
}
