package com.datastructure.core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import com.datastructure.utility.LinkedList;
import com.jda.functional.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws Exception {
		
		LinkedList<Integer> list=new LinkedList<>();
		  File file1=new File("/home/bridgelabz/Javaprograms/Functional_programs/javaprograms/src/com/jda/functional/algorithms/file2.txt");
		  BufferedReader br=new BufferedReader(new FileReader(file1));
		  String st ;
		  String str="";
		  while((st=br.readLine())!=null){
			 
			       str=str+st+' ';
		  }
		  br.close();
		  String[] arr=str.split(" ");
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i]+" ");
			  list.addInAscending(Integer.parseInt(arr[i]));
		  } 
		  System.out.println("in ascending order");
		  list.printList();
		  System.out.println("Enter integer element to be searched:");
		  //String item=Utility.getString();
		  int item=Utility.getInteger();
		  //String item1=item.toLowerCase();
		  boolean flag=list.contains(item);
		  if(flag)
		  {
			  System.out.println("Element found then removed that element from list:");
			  list.remove(item);
		  }
		  else
		  {
			  System.out.println("Word not found then added element to list in sorted order");
			  list.addInAscending(item);
		  }
		  list.printList();
			  
		}
	
		
	}
		

	


