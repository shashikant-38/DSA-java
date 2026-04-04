imp prblm

// ❌ Brute Force (why bad)
// 👉 Try all pairs:
// Buy at 7 → sell at 1,5,3,6,4
// Buy at 1 → sell at 5,3,6,4
// etc…
// 👉 Too many checks → O(n²)

// ⚡ Optimal Thinking (IMPORTANT SHIFT)
// Instead of:
// “Try all buy-sell pairs”
// Think:
// “What is the best price to buy so far?”

track the minimum price seen so far and compute the profit at each step. This gives the maximum profit in O(n) time.

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - min);
            }
        }

        return profit;
    }
}
// “Maintain minimum price and compute max profit in one pass.”
