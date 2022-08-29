package SlidingWindow;

public class BestTimeToBuySellStock {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     */
    public int maxProfit(int[] prices) {
        int buy = -1;
        int sell = -1;
        int money = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            // update buy point, reset sell point
            if (buy == -1 || price < buy) {
                buy = price;
                sell = -1;
            }
            // if sell is updated, check new profit
            else if (price >= sell) {
                sell = price;
                profit = sell - buy;
                if (profit > money) {
                    money = profit;
                }
            }
        }
        return money;
    }
}
