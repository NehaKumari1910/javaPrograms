package com.jda.functional.core;

import com.jda.functional.utility.Utility;


public class replace_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user_name=Utility.getString();
		String str= "Hello <<UserName>>, How are you?";
		String replaced_string=str.replace("<<UserName>>",user_name);
		System.out.println(replaced_string);
		
	}
}
