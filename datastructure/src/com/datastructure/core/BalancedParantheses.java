package com.datastructure.core;

import com.datastructure.utility.Stack;
import com.jda.functional.utility.Utility;

/**
 *
 * @author bridgelabz
 */
public class BalancedParantheses {

	public static void main(String[] args) {
		Stack st=new Stack();
		System.out.println("Enter arithmetic expression:");
		String exp=Utility.getString();
		char[] charArr=exp.toCharArray();
		for(int i=0;i<charArr.length;i++)
		{
			if(charArr[i]=='(' || charArr[i]=='{' || charArr[i]=='[')
			    st.push(charArr[i]);
			else if(!st.isEmpty() && ((charArr[i]==')' && st.getPeek()=='(') || (charArr[i]=='}' && st.getPeek()=='{') ||(charArr[i]==']' && st.getPeek()=='[')))
				 st.pop();
			else
				st.push(charArr[i]);
		}
		if(st.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("not Balanced");
	}
}