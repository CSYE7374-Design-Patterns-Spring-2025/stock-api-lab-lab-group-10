package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

abstract class Stock implements Tradable {
    private final String companyName;
    private double stockPrice;
    private final String description;
    private final List<Double> bids;

    public Stock(String companyName, double stockPrice, String description) {
        this.companyName = companyName;
        this.stockPrice = stockPrice;
        this.description = description;
        this.bids = new ArrayList<>();
    }

    @Override
    public void setBid(String bid) {
        try {
            double bidValue = Double.parseDouble(bid);
            bids.add(bidValue);
            updatePrice(bidValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid format: " + bid);
        }
    }

    protected void updatePrice(double bidValue) {
        this.stockPrice += bidValue * calculateMetricValue();
    }

    protected abstract double calculateMetricValue();

    @Override
    public String toString() {
        return "Stock[name=" + companyName + ", price=" + stockPrice + ", description=" + description + "]";
    }

    public String getCompanyName() {
        return companyName;
    }
}
