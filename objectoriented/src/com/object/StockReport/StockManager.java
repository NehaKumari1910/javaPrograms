package com.object.StockReport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jda.functional.utility.Utility;

public class StockManager {
	public static void main(String[] args) throws IOException {
		List<Stock> stocks=StockPortfolio.stocksAvailable();
	  String accountName="";
		String path="/home/bridgelabz/javaPrograms/objectoriented/src/com/object/StockReport/stockAccount";
		while (true) {
			System.out.println("do you have an account?,if no,then press 1 to create a new account otherwise press 2 to open existing account");
			System.out.println("Enter 3 to buy shares");
			System.out.println("Enter 4 to sell shares");
			System.out.println("Enter 5 to save ");
			System.out.println("Enter 6 to print report ");
			System.out.println("Enter 7 to calculate value of stocks");
			System.out.println("Enter -1 to quit");
			int check = Utility.getInteger();
			Utility.getString();
			
			if (check == -1)
				break;
			switch (check) {
			case 1:
				System.out.println("Enter name of new account" );
				accountName=Utility.getString();
				StockAccount.createStockAccount(accountName);
				break;
			case 2:
				StockAccount.displayAccounts();
				System.out.println("Enter address book name to open");
				accountName = Utility.getString();
				StockAccount.openExistingAccount(accountName);
				break;
			case 3:
				StockAccount.printReport();
				System.out.println("Enter amount to buy shares");
				int amount=Utility.getInteger();
				Utility.getString();
				System.out.println("Enter Symbol");
				String symbol=Utility.getString();
				StockAccount.buy(amount,symbol);
				StockAccount.printReport();
				break;
			case 4:
				StockAccount.printReport();
				System.out.println("Enter amount to sell shares");
				amount=Utility.getInteger();
				Utility.getString();
				System.out.println("Enter Symbol");
				 symbol=Utility.getString();
				StockAccount.sell(amount,symbol);
				StockAccount.printReport();
				break;
			case 5:
				StockAccount.save(accountName);
				break;
			case 6:
				StockAccount.printReport();
				break;
			case 7:
				StockPortfolio.ValueOf(accountName);
				break;

			}

		}

	}

}