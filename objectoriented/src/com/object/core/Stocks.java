package com.object.core;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.jda.functional.utility.Utility;
import com.object.utility.ParseJSON;

public class Stocks {

	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException, org.json.simple.parser.ParseException 
	{
	
		JSONObject jsonobject1=ParseJSON.JSONparser("/home/bridgelabz/javaPrograms/objectoriented/src/com/object/stocks.json");
		JSONArray stocks1=(JSONArray) jsonobject1.get("stocks");
			  
				while(true)
				{
					System.out.println("Enter 1 to add share tostock ");
					System.out.println("Enter 0 to read stocks");
					System.out.println("Enter -1 to quit.");
					int check=Utility.getInteger();
					 JSONObject newobj=new JSONObject();
					if(check==1)
					{
						   JSONObject obj=new JSONObject();
						   System.out.println("Enter stock's name:");
						   Utility.getString();
						   String name=Utility.getString();
						   obj.put("stock_name",name);
						   System.out.println("Enter number of shares");
						   int num=Utility.getInteger();;
						   obj.put("numberOfShare", num);
						   System.out.println("Enter price of share");
						   int price=Utility.getInteger();
						   obj.put("share_price", price);
						   stocks1.add(obj);
						   newobj.put("stocks", stocks1);
						   try (FileWriter file = new FileWriter("/home/bridgelabz/javaPrograms/objectoriented/src/com/object/stocks.json")) {

				            file.write(newobj.toJSONString());
				            file.flush();

				        } catch (IOException e) {
				            e.printStackTrace();
				        }
					}
					else if(check==0){

						JSONObject jsonobject=ParseJSON.JSONparser("/home/bridgelabz/javaPrograms/objectoriented/src/com/object/stocks.json");
						JSONArray stocks=(JSONArray) jsonobject.get("stocks");
								long stocksPrice=0;
							  
					   for(Object stock: stocks)
					   { 
					   	JSONObject obj=(JSONObject)stock;
					   	String name=(String)obj.get("stock_name");
					   	System.out.println("Stock Name= "+name);
					   	Long shares=(Long)obj.get("numberOfShare");
					   	System.out.println("number of shares = "+shares);
					   	Long price=(Long)obj.get("share_price");
					   	System.out.println("Share price = "+price);
					   	System.out.println("value of "+name+" is "+shares*price);
					   	stocksPrice+=shares*price;
					   }
					   System.out.println("Total value of stocks is "+stocksPrice);
					}
					else
						break;
				}
					   
			}
}
