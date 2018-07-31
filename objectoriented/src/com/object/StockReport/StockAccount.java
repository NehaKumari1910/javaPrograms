package com.object.StockReport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.datastructure.utility.QueueLinkedList;
import com.jda.functional.utility.Utility;

public class StockAccount {
	static List<Stock> stocks=StockPortfolio.stocksAvailable();
	static QueueLinkedList<CompanyShares> shareOfPerson=new QueueLinkedList<>();
	static Date date=new Date();
	
	public static void createStockAccount(String filename) throws IOException
	{
		while (true) {	
			File file = new File(
					"/home/bridgelabz/javaPrograms/objectoriented/src/com/object/StockReport/stockAccount/" + filename + ".json");
			if (file.createNewFile()) {
				System.out.println("Account opened successfully");
				break;
			} else {
				System.out.println("File already exists,Enter another name for account");
				filename = Utility.getString();
			}
		}
	}
	public static void printReport()
	{
		for(Stock stock:stocks)
		{
			System.out.println("Name => "+stock.getName());
			System.out.println("Number of shares => "+stock.getNoOfshares());
			System.out.println("Price => "+stock.getPrice());
			System.out.println("Symbol => "+stock.getSymbol());
			System.out.println();
		}
		CompanyShares cs;
		while(!shareOfPerson.isEmpty())
		{
			cs=shareOfPerson.dequeue();
			System.out.println("Symbol => "+cs.getSymbol());
			System.out.println("No of shares bought => "+cs.getNoOfShares());
			System.out.println("date of transaction => "+cs.getDate());
			
		}
		
	}
	public static void buy(int amount, String symbol) {
		CompanyShares cs =new CompanyShares();
		for(Stock stock:stocks)
		{
			if(stock.getSymbol().equals(symbol) && stock.getNoOfshares()>0)
			{
				System.out.println("hfj");
				int totalSharesBought=amount/(stock.getPrice());
				System.out.println(totalSharesBought);
				int sharesAvaliable=stock.getNoOfshares()-totalSharesBought;
				System.out.println(sharesAvaliable);
				stock.setNoOfshares(sharesAvaliable);
				cs.setNoOfShares(totalSharesBought);
				cs.setSymbol(symbol);
				cs.setDate(date.toString());
				shareOfPerson.push(cs);
				return;
			}
		}
	}
	
}
