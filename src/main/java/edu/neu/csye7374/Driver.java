package edu.neu.csye7374;

/**
 * 
 * @author Preyash Mehta
 * 
 */

public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        StockMarket market = StockMarket.getInstance();

        Stock googleStock = new Amazon("AMZN", 2800.0, "Amazon");
        Stock metaStock = new Meta("META", 340.0, "Meta");

        market.addStock(googleStock);
        market.addStock(metaStock);

        market.showAllStocks();

        String[] bids = {"10", "20", "-5", "15", "30", "-10"};
        for (String bid : bids) {
            market.tradeStock("AMZN", bid);
            market.tradeStock("META", bid);
        }

        market.showAllStocks();

        market.removeStock("META");
        market.showAllStocks();

        System.out.println("============Main Execution End===================");
   
    }
}



