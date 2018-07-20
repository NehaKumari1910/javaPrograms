package com.object.core;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.object.utility.ParseJSON;

public class Inventory {

	public static void main(String[] args) throws FileNotFoundException,  IOException, java.text.ParseException, ParseException {
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
