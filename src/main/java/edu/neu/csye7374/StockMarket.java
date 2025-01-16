package edu.neu.csye7374;

import java.util.HashMap;
import java.util.Map;

public class StockMarket {
    private static StockMarket instance;
    private Map<String, Stock> stocks;

    private StockMarket() {
        stocks = new HashMap<>();
    }

    public static synchronized StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    public void addStock(Stock stock) {
        stocks.put(stock.getCompanyName(), stock);
        System.out.println("Stock added: " + stock);
    }

    public void tradeStock(String name, String bid) {
        Stock stock = stocks.get(name);
        if (stock != null) {
            stock.setBid(bid);
            System.out.println("Traded stock: " + stock);
        } else {
            System.out.println("Stock not found: " + name);
        }
    }

    public void removeStock(String name) {
        Stock removed = stocks.remove(name);
        if (removed != null) {
            System.out.println("Stock removed: " + removed);
        } else {
            System.out.println("Stock not found: " + name);
        }
    }

    public void showAllStocks() {
        System.out.println("All stocks in the market:");
        for (Stock stock : stocks.values()) {
            System.out.println(stock);
        }
    }
}
