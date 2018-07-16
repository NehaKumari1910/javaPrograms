package com.datastructure.core;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

import com.datastructure.utility.List;
import com.jda.functional.utility.Utility;

public class SearchNumber {

	public static void main(String[] args) throws IOException {
		  List list=new List();
		 /* File file1=new File("/home/bridgelabz/javaPrograms/javaprograms/src/com/jda/functional/algorithms/file2.txt");
		  BufferedReader br=new BufferedReader(new FileReader(file1));
		  String st ;
		  String str="";
		  while((st=br.readLine())!=null){
			 
			       str=str+st+' ';
		  }
		  br.close();
		  String[] arr=str.split(" ");*/
		  String [] arr={"11","22","7","14","16","77","44","55","26","93","17","31","20"};
		  for(int i=0;i<arr.length;i++)
		  {
			     int key=Integer.parseInt(arr[i])%11;
			   	 list.add(Integer.parseInt(arr[i]),key);
		  } 
		 list.printList();
		  System.out.println("Enter integer element to be searched:");
		
		  int item=Utility.getInteger();
		  int key=item%11;
		  boolean flag=list.contains(key,item);
		  if(flag)
		  {
			  System.out.println("Element found");
			  list.remove(key,item);
			  System.out.println("list after removing element:");
			  list.printList();
		  }
		  else
		  {
			  System.out.println("Element not found ");
			  list.add(item,key);
			  System.out.println("list after adding element:");
			  list.printList();
		  }
		 // list.printList();
	}
}
