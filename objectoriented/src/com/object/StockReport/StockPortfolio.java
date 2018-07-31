package com.object.StockReport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;



public class StockPortfolio {
	public static List<Stock> stocksAvailable()
	{
		List<Stock> stocks=new ArrayList<Stock>();
		ObjectMapper mapper=new ObjectMapper();
		String path="/home/bridgelabz/javaPrograms/objectoriented/src/com/object/StockReport";
		File file1 = new File(path+"/stocks.json");
		try {
			stocks = mapper.readValue(file1, new TypeReference<ArrayList<Stock>>() {});
		} 
		catch (Exception e) 
		{
			System.out.println("Empty file"+e);
		}
		return stocks;
	}
}

