package edu.neu.csye7374;

public interface Tradeable1 {
    default String getMetric() {
        return "Default Metric for Tradeable1";
    }
}
