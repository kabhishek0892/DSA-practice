package ArraysTest;
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */

public class bestTimetoBuySellStcok {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 13, 1};
        System.out.println(usingBruteForch(prices));
        System.out.println(ONApproach(prices));
    }

    static int usingBruteForch(int[] prices) {

        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }

    static int ONApproach(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit) {
                maxProfit = Math.max(prices[i] - buy, maxProfit);
            }
        }
        return maxProfit;
    }

}