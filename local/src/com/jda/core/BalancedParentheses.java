package com.jda.core;

import com.jda.utility.Utility;
import com.jda.utility.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		Stack st=new Stack();
		System.out.println("Enter arithmetic ecpression:");
		String exp=Utility.getstring();
		char[] charArr=exp.toCharArray();
		char ch;
		for(int i=0;i<charArr.length;i++)
		{
			if(charArr[i]=='(')
			    st.push(charArr[i]);
			else if(charArr[i]==')')
				 ch = st.pop();
		}
		if(st.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("not Balanced");

	}

}
