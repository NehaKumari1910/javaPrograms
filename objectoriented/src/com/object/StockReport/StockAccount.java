package com.object.StockReport;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.datastructure.utility.QueueLinkedList;
import com.datastructure.utility.StackLinkedList;
import com.jda.functional.utility.Utility;
import com.object.core.AddressBook;
import com.object.core.Person;

public class StockAccount {
	static List<Stock> stocks=StockPortfolio.stocksAvailable();
	static QueueLinkedList<CompanyShares> shareOfPerson=new QueueLinkedList<>();
	static Date date=new Date();
	static String path ="/home/bridgelabz/javaPrograms/objectoriented/src/com/object/StockReport/stockAccount";
	static ObjectMapper mapper = new ObjectMapper();
	static StackLinkedList<String> symbols=new StackLinkedList<>();
	static QueueLinkedList<String> transactions=new QueueLinkedList<>();
	public static void shares(ArrayList<CompanyShares> share)
	{
		for(CompanyShares cs:share)
		     shareOfPerson.push(cs);
	}
	public static void createStockAccount(String filename) throws IOException
	{
		while (true) {	
			File file = new File(path+"/"+ filename + ".json");
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
		System.out.println("---------------------------------------------- Stock Report---------------------------------------------------");
		for(Stock stock:stocks)
		{
			System.out.println("Name => "+stock.getName());
			System.out.println("Number of shares => "+stock.getNoOfshares());
			System.out.println("Price => "+stock.getPrice());
			System.out.println("Symbol => "+stock.getSymbol());
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------  person's shares -------------------------------------------------");
		CompanyShares cs;
		 ArrayList<CompanyShares> arr=new ArrayList<>();
		int i=0;
		while(!shareOfPerson.isEmpty())
		{
			cs=shareOfPerson.dequeue();
			System.out.println("Symbol => "+cs.getSymbol());
			System.out.println("No of shares => "+cs.getNoOfShares());
			System.out.println("date of transaction => "+cs.getDate());
			System.out.println("state => "+cs.getState());
			arr.add(cs);
			i++;
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		shares(arr);
	}
	public static void buy(int amount, String symbol) {
	
		for(Stock stock:stocks)
		{
			if(stock.getSymbol().equals(symbol))
			{
				CompanyShares cs =new CompanyShares();
				int totalSharesBought,sharesAvailable;
					if(stock.getNoOfshares()>(amount/(stock.getPrice())))
					{
						 totalSharesBought=amount/(stock.getPrice());
						sharesAvailable=stock.getNoOfshares()-totalSharesBought;	
					}
					else
					{
						 totalSharesBought=stock.getNoOfshares();
						sharesAvailable=0;
					}
					stock.setNoOfshares(sharesAvailable);
					cs.setNoOfShares(totalSharesBought);
					cs.setSymbol(symbol);
					cs.setDate(date.toString());
					cs.setState("bought");
					shareOfPerson.push(cs);
					symbols.push(symbol);
					transactions.push(date.toString());
					return;
			}
		}
				System.out.println("For buying shares, Compay not found");
		}
	public static void sell(int amount, String symbol) {
		CompanyShares cs=null;
		CompanyShares cs1=new CompanyShares();
      Stock stk=null;
      int i=0,idx=0;
		for(Stock stock:stocks)
		{
			if(stock.getSymbol().equals(symbol))
			{
				idx=i;
				stk=stock;
				break;
			}
			i++;
		}
		ArrayList<CompanyShares> arr=new ArrayList<>();
		int check=0;
		while(!shareOfPerson.isEmpty())
		{
			cs=shareOfPerson.dequeue();
			arr.add(cs);
			if( stk!=null && cs.getSymbol().equals(symbol))
			{
				check=1;
				int sharesSold,comSharesAvailable,stocksAvailable;
				if(cs.getNoOfShares()>=amount/stk.getPrice())
				{
					sharesSold=amount/stk.getPrice();
					comSharesAvailable=cs.getNoOfShares()-sharesSold;	
				}
				else
				{
					sharesSold=cs.getNoOfShares();
					comSharesAvailable=0;	
				}
				stocksAvailable=stk.getNoOfshares()+sharesSold;
				cs1.setSymbol(symbol);
			   cs1.setNoOfShares(sharesSold);	
			   cs1.setDate(date.toString());
			   cs1.setState("sold");
				symbols.push(symbol);
				transactions.push(date.toString());
		//	   System.out.println
			   stk.setNoOfshares(stocksAvailable);
			   stocks.set(idx, stk);
			}
		}
		arr.add(cs1);
		shares(arr);
		if(check==0)
				System.out.println("For selling shares,Company not found");
		}
		
	public static ArrayList<CompanyShares> queToArrayList(QueueLinkedList<CompanyShares> shares)
	{
		ArrayList<CompanyShares> arr=new ArrayList<>();
		while(!shares.isEmpty())
		{
			arr.add(shares.dequeue());
		}
		shares(arr);
		return arr;
	}
	public static ArrayList<CompanyShares> readFromFile(String filename)
	{
		ArrayList<CompanyShares> ar=new ArrayList<>();
		System.out.println("File"+filename);
		File file1 = new File(path+"/"+filename+".json");
		
		try {
			ar = mapper.readValue(file1, new TypeReference<ArrayList<CompanyShares>>() {
			});
		} catch (Exception e) {
			System.out.println("Empty file,Buy Stock");
		}
		return ar;
	}
	static void save(String filename) throws JsonGenerationException, JsonMappingException, IOException {
		
		ArrayList<CompanyShares> ar=readFromFile(filename);
			ar=queToArrayList(shareOfPerson);
	//	System.out.println("size"+ar.size());
		String Data = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ar);
		System.out.println(path+"/"+filename+".json");
		FileWriter writer = new FileWriter(path+"/"+filename+".json"); 
		System.out.println(	Data);
		writer.write(Data);
		writer.close();
		String stocks1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stocks);
		 writer = new FileWriter(path+"/"+ "stocks.json"); 
		//System.out.println(data);
		writer.write(stocks1);
		writer.close();
		
	}
	public static void displayAccounts()
	{
		File dir = new File(path);
		if (dir.isDirectory()) {
			if (dir.list().length > 0) {
				for (File file : dir.listFiles()) {
					System.out.println(file.getName());
				}
			}
			else
				System.out.println("There is no any account opened.");
		}
	}
	public static void openExistingAccount(String filename) {
		System.out.println(filename);
		     ArrayList<CompanyShares> share=readFromFile(filename);
		  shares(share);
	}
}
