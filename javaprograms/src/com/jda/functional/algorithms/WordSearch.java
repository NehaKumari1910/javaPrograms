package com.jda.functional.algorithms;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

import com.jda.functional.utility.Utility;

public class WordSearch {

	public static void main(String[] args) throws Exception {
	  File file1=new File("/home/bridgelabz/Javaprograms/Functional_programs/functional/src/com/jda/functional/algorithms/file.txt");
	  BufferedReader br=new BufferedReader(new FileReader(file1));
	  String st ;
	  String str="";
	  while((st=br.readLine())!=null){
		 
		       str=str+st.toLowerCase();
	  }
	  br.close();
	  String[] arr=str.split(",");
	  String[] sortedArr=Utility.InsertionsortString(arr);
	  System.out.println("Enter word to be searched:");
	  String item=Utility.getString();
	  boolean flag=Utility.BinarySearchString(sortedArr, item.toLowerCase());
	  if(flag==true)
		  System.out.println("Word found");
	  else
		  System.out.println("Word not found");
	  

	}

}
