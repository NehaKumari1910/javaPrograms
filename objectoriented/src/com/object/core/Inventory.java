package com.object.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.object.utility.ParseJSON;

public class Inventory {

	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException, org.json.simple.parser.ParseException {
		ParseJSON.JSONparser("/home/bridgelabz/javaPrograms/objectoriented/src/com/object/inventory.json");

	}

}
