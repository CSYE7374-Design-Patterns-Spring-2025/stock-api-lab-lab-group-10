package edu.neu.csye7374;

public class Meta extends Stock{
    public Meta(String companyName, double stockPrice, String description) {
        super(companyName, stockPrice, description);
    }

    @Override
    protected double calculateMetricValue() {
        return 0.1;
    }
    @Override
    public String getMetric() {
        return "Meta's Metric is "+calculateMetricValue();
    }
}
