package com.datastructure.core;

import com.datastructure.utility.Stack;
import com.jda.functional.utility.Utility;

/**
 * Check for Balance String
 * @author bridgelabz
 */
public class BalancedParantheses {

	public static void main(String[] args) {
		Stack st=new Stack();
		System.out.println("Enter arithmetic expression:");
		String exp=Utility.getString();
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