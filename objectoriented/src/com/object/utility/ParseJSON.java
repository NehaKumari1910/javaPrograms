package com.object.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ParseJSON {
	public static void JSONparser(String filename) throws ParseException,FileNotFoundException,IOException, org.json.simple.parser.ParseException
	{
		   JSONParser parser=new JSONParser();
		   Reader reader=new FileReader(filename);
		   Object jsonObj=parser.parse(reader);
		   JSONObject jsonobject=(JSONObject) jsonObj;
		   JSONArray inventory=(JSONArray) jsonobject.get("Inventory");
		   for(Object inv : inventory)
		   { 
		   	JSONObject obj=(JSONObject)inv;
		   	String name=(String)obj.get("name");
		   	System.out.println("Name= "+name);
		   	Long weight=(Long)obj.get("weight");
		   	System.out.println("Weight = "+weight+"kg");
		   	Long price=(Long)obj.get("price");
		   	System.out.println("price = "+price+"per kg");
		   	
		   }
		   
	}

}
