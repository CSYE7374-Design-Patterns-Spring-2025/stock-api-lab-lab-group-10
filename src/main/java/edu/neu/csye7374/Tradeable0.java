package edu.neu.csye7374;

public interface Tradeable0 {
    default void setBid(String bid) {
        System.out.println("Bid set: " + bid);
    }

    default String getMetric() {
        return "Default Metric";
    }
}
