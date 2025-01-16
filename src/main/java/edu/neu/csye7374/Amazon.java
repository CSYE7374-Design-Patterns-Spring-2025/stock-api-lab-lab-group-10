package edu.neu.csye7374;

public class Amazon extends Stock{

    public Amazon(String companyName, double stockPrice, String description) {
        super(companyName, stockPrice, description);
    }

    @Override
    protected double calculateMetricValue() {
        return 0.15;
    }

    @Override
    public String getMetric() {
        return "Amazon's Metrics is: "+calculateMetricValue();
    }
}
