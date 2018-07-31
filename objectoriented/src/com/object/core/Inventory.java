package com.object.core;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.jda.functional.utility.Utility;
import com.object.utility.ParseJSON;

public class Inventory {

	public static void main(String[] args) throws FileNotFoundException,  IOException, java.text.ParseException, ParseException {
		JSONObject jsonobject1=ParseJSON.JSONparser("/home/bridgelabz/javaPrograms/objectoriented/src/com/object/inventory.json");
		JSONArray inventory1=(JSONArray) jsonobject1.get("Inventory");
		while(true)
		{
			System.out.println("Enter 1 to add product to inventory ");
			System.out.println("Enter 0 to read inventory");
			System.out.println("Enter -1 to quit.");
			int check=Utility.getInteger();
			 JSONObject newobj=new JSONObject();
			if(check==1)
			{
				   JSONObject obj=new JSONObject();
				   System.out.println("Enter name:");
				   Utility.getString();
				   String name=Utility.getString();
				   obj.put("name",name);
				   System.out.println("Enter weight");
				   int num=Utility.getInteger();;
				   obj.put("weight", num);
				   System.out.println("Enter price");
				   int price=Utility.getInteger();
				   obj.put("price", price);
				   inventory1.add(obj);
				   newobj.put("Inventory", inventory1);
				   try (FileWriter file = new FileWriter("/home/bridgelabz/javaPrograms/objectoriented/src/com/object/inventory.json")) {

		            file.write(newobj.toJSONString());
		            file.flush();

		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			}
		else if(check==0)
		{
			
			JSONObject jsonobject=ParseJSON.JSONparser("/home/bridgelabz/javaPrograms/objectoriented/src/com/object/inventory.json");
			JSONArray inventory=(JSONArray) jsonobject.get("Inventory");
	   for(Object inv : inventory)
	   { 
	   	JSONObject obj=(JSONObject)inv;
	   	String name=(String)obj.get("name");
	   	System.out.println("Name= "+name);
	   	Long weight=(Long)obj.get("weight");
	   	System.out.println("Weight = "+weight+"kg");
	   	Long price=(Long)obj.get("price");
	   	System.out.println("price = "+price+"rs/ kg\n");
	   	
	   }
		}
		}
	}

	}


