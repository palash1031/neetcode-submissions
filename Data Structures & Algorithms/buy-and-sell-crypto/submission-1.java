class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = prices[0];
        int profit = -1;

        for (int i = 0; i < prices.length; i++) {
            buyDay = Math.min(buyDay, prices[i]);
            profit = Math.max(profit, (prices[i] - buyDay));
        }
        return profit;
    }
}
