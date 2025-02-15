package edu.neu.csye7374;

public class StockMarketDemo {
    public static void demo() {
        StockMarket stockMarket = StockMarket.getInstance();
        AmazonStock amazonStock = new AmazonStock("Amazon", 150.51, "Amazon Inc.");
        ChewyStock chewyStock = new ChewyStock("Chewy", 200.23, "Chewy Inc.");
        TeslaStock teslaStock = new TeslaStock("Tesla", 400.23, "Tesla Corp.");
        GoogleStock googleStock = new GoogleStock("Google", 300.23, "Google Corp.");
        AmexStock amexStock = new AmexStock("AMX", 100.0, "American Express", 0.10);
        AppleStock appleStock = new AppleStock("AAPL", 200.0, "Nvidia Corporation", 0.25);
        FacebookStock facebookStock = new FacebookStock("Facebook", 100.0, "Facebook Inc.");
        stockMarket.addStock(amazonStock);
        stockMarket.addStock(chewyStock);
        stockMarket.addStock(amexStock);
        stockMarket.addStock(appleStock);
        stockMarket.addStock(teslaStock);
        stockMarket.addStock(googleStock);
        System.out.println("Current stocks added to the stock market: ");
        stockMarket.showAllStocks();
        System.out.println();
        double[] amazonBids = new double[]{155.0, 140.0, 138.0, 145.0, 150.0, 155.0};
        double[] chewyBids = new double[]{205.0, 190.0, 195.0, 210.0, 215.0, 200.0};
        double[] amexBids = new double[]{105.0, 102.0, 108.0, 106.0, 110.0, 107.0};
        double[] appleBids = new double[]{205.0, 202.0, 208.0, 206.0, 210.0, 207.0};
        double[] facebookBids = new double[]{155.0, 140.0, 138.0, 145.0, 150.0, 125.0};
        double[] teslaBids = new double[]{401.0, 402.0, 403.0, 404.0, 405.0, 406.0};
        double[] googleBids = new double[]{301.0, 302.0, 303.0, 304.0, 305.0, 306.0};
        System.out.println("Starting trading Amazon Stock");
        double[] var6 = amazonBids;
        int var7 = amazonBids.length;

        int var8;
        double chewyBid;
        for(var8 = 0; var8 < var7; ++var8) {
            chewyBid = var6[var8];
            stockMarket.tradeStock(amazonStock, chewyBid);
            System.out.println(amazonStock);
            System.out.println("Stock metric after bid: " + amazonStock.getMetric());
        }

        System.out.println();
        System.out.println("Starting trading Chewy Stock");
        var6 = chewyBids;
        var7 = chewyBids.length;

        for(var8 = 0; var8 < var7; ++var8) {
            chewyBid = var6[var8];
            stockMarket.tradeStock(chewyStock, chewyBid);
            System.out.println(chewyStock);
            System.out.println("Stock metric after bid: " + chewyStock.getMetric());
        }

        System.out.println();
        System.out.println("Starting trading Amex Stock");
        for (double bid : amexBids) {
            System.out.println("\nPlacing bid for AMX: " + bid);
            stockMarket.tradeStock(amexStock, bid);
            System.out.println("AMX metric: " + amexStock.getMetric());
            System.out.println(amexStock);
        }

        System.out.println();
        System.out.println("Starting trading Apple Stock");
        for (double bid : appleBids) {
            System.out.println("\nPlacing bid for AAPL: " + bid);
            stockMarket.tradeStock(appleStock, bid);
            System.out.println("AAPL metric: " + appleStock.getMetric());
            System.out.println(appleStock);
        }

        System.out.println();
        System.out.println("Starting trading Facebook Stock");
        for (double bid : facebookBids) {
            System.out.println("\nPlacing bid for Facebook: " + bid);
            stockMarket.tradeStock(facebookStock, bid);
            System.out.println("Facebook metric: " + facebookStock.getMetric());
            System.out.println(facebookStock);
        }

        System.out.println("start trading for Tesla stock");
        for(double bid: teslaBids){
            System.out.println("\nPlacing bid for TSLA: " + bid);
            stockMarket.tradeStock(teslaStock, bid);
            System.out.println("TSLA metric: " + teslaStock.getMetric());
            System.out.println(teslaStock);
        }

        System.out.println("start trading for Google stock");
        for(double bid: googleBids){
            System.out.println("\nPlacing bid for GOOG: " + bid);
            stockMarket.tradeStock(googleStock, bid);
            System.out.println("GOOG metric: " + googleStock.getMetric());
            System.out.println(googleStock);
        }


        System.out.println();
        System.out.println("All stocks in the market with current price after bids: ");
        stockMarket.showAllStocks();
        stockMarket.removeStock(chewyStock);
        System.out.println();
        System.out.println("Current stocks in stock market after removing a stock: ");
        stockMarket.showAllStocks();
    }
}
