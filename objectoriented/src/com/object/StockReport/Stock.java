package com.object.StockReport;

public class Stock {
	private String name;
	private int noOfshares;
	private int price;
	private String symbol;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfshares() {
		return noOfshares;
	}
	public void setNoOfshares(int noOfshares) {
		this.noOfshares = noOfshares;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
