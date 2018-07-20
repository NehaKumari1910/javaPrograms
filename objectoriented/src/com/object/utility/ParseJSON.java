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
	public static JSONObject  JSONparser(String filename) throws ParseException,FileNotFoundException,IOException, org.json.simple.parser.ParseException
	{
		   JSONParser parser=new JSONParser();
		   Reader reader=new FileReader(filename);
		   Object jsonObj=parser.parse(reader);
		   JSONObject jsonobject=(JSONObject) jsonObj;
		   return jsonobject;
		   
		   
	}

}
