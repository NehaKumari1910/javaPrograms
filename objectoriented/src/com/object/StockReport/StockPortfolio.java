package com.object.StockReport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;



public class StockPortfolio {
	 private static List<Stock> stocks=new ArrayList<Stock>();
	public static List<Stock> stocksAvailable()
	{
		
		ObjectMapper mapper=new ObjectMapper();
		String path="/home/bridgelabz/javaPrograms/objectoriented/src/com/object/StockReport/stockAccount";
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

	public static void ValueOf(String accountName) {
		ArrayList<CompanyShares> shares=StockAccount.readFromFile(accountName);
		 stocks=StockPortfolio.stocksAvailable();
		 int totalValue=0;
		for(CompanyShares cs:shares)
		{	
			for(Stock stock:stocks)
			{
				int value=0;
				if(cs.getSymbol().equals(stock.getSymbol()))
				{
				       value=cs.getNoOfShares()*stock.getPrice();
				       totalValue+=value;
				       System.out.println("value of shares of "+stock.getName()+" =" +value);
				       break;
				}
			}
		}
		  System.out.println("Total value of shares =" +totalValue);
	}
}

