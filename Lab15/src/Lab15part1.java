/*
 * Keven Disen
 * ID: 111433335
 * November 5, 2018
 * CSE 114 Lab#15 part1
 */
import java.util.*;
public class Lab15part1 {
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL","Oracle Corporation");
		stock.currentPrice = 34.35;
		stock.previousClosingPrice = 34.5;
		
		System.out.println("The price-change percentage is " + stock.getChangePercent() + "%");
}
	static class Stock{
		private String stocksymbol;
		private String stockname;
		private double previousClosingPrice;
		private double currentPrice;
		
		public Stock(String symbol, String name) {
			stocksymbol = symbol;
			stockname = name;
		}
		public double getChangePercent() {
			double change = ((currentPrice - previousClosingPrice)/currentPrice)*100;
			return change;
		}
		
		
	}
}
