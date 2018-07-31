package com.object.StockReport;

import java.io.IOException;
import java.util.List;

import com.jda.functional.utility.Utility;

public class StockManager {

	public static void main(String[] args) throws IOException {
		List<Stock> stocks=StockPortfolio.stocksAvailable();
		while (true) {
			System.out.println("Enter 1 to create stock account");
			System.out.println("Enter 2 to open an existing account");
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
				System.out.println("Enter name of account" );
				StockAccount.createStockAccount(Utility.getString());
				break;
			case 2:
				StockAccount.createStockAccount(Utility.getString());
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
			/*case 4:
				sell();
				break;
			case 5:
				save();
			case 6:
				printReport();
			case 7:
				ValueOf();*/

			}

		}

	}

}