package Greedy_Approach;

//Leetcode problem Link:- https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
public class Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee {

    public static int maxProfit(int[] prices, int fee) {

        int n=prices.length;
        int profit=0;
        int effectiveBuyPrice= prices[0];
        for(int i=1; i<n; i++){
            profit=Math.max(profit , prices[i] - effectiveBuyPrice - fee);
            effectiveBuyPrice=Math.min(effectiveBuyPrice , prices[i] - profit);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;

        System.out.println("maximum profit :"+ maxProfit(prices, fee));
    }
    
}
