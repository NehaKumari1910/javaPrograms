package com.jda.utility;

public class Stack {
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
	    	if(top<0)
	    		return true;
	    	else
	    		return false;
	    }
	    public int size()
	    {
	    	return stk.length;
	    }
	
}
