package com.learn.questions.day12;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {7,1,5,10,1,4};
        maxProfit(nums);
    }
    public static int maxProfit(int[] prices) {
        // We need prices for 2 days at least to find the profit.
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // Checking if we can profit with previous day's price.
            // If yes, then we buy on previous day and sell on current day.
            // Add all such profits to get the total profit.
            if (prices[i - 1] < prices[i]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        System.out.println(totalProfit);

        return totalProfit;
    }
}
