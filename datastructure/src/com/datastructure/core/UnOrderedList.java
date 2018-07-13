package com.datastructure.core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import com.datastructure.utility.LinkedList;
import com.jda.functional.utility.Utility;

public class UnOrderedList {

	public static void main(String[] args) throws Exception {
		LinkedList<String> list=new LinkedList<String>();
		//LinkedList<Integer> list=new LinkedList<>();
		  File file1=new File("/home/bridgelabz/Javaprograms/Functional_programs/javaprograms/src/com/jda/functional/algorithms/file.txt");
		  BufferedReader br=new BufferedReader(new FileReader(file1));
		  String st ;
		  String str="";
		  while((st=br.readLine())!=null){
			 
			       str=str+st+',';
		  }
		  br.close();
		  String[] arr=str.split(",");
		  for(int i=0;i<arr.length;i++)
		  {
			  list.add(arr[i]);
		  } 
		  list.printList();
		  System.out.println("Enter word to be searched:");
		  //String item=Utility.getString();
		  String item=Utility.getString();
		  //String item1=item.toLowerCase();
		  boolean flag=list.contains(item);
		  if(flag)
		  {
			  System.out.println("Word found");
			  list.remove(item);
		  }
		  else
		  {
			  System.out.println("Word not found");
			  list.add(item);
		  }
		  list.printList();
		  System.out.print(list);
		  {
			  
		  }
			  
		}
	
		
	}
		

	


