package Java.Array;

// Leetcode 121 : Best time to buy and sell stock (Easy)

public class BuyAndSellStocks {
    public static int buySaleStocks(int[] prices){
        //take initial buy price and max profit
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        //loop in stock prices
        //find the smallest buy price and calculate profit.
        for(int todayStockPrice : prices){
            if(buyPrice > todayStockPrice){
                buyPrice = todayStockPrice;
            } else {
                int profit = todayStockPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        System.out.println(buySaleStocks(stockPrices));
    }
}


