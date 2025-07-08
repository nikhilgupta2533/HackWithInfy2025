package Greedy_Approach;

import java.util.Arrays;
//Level :-easy 
//Leetcode problem Link:- https://leetcode.com/problems/buy-two-chocolates/
public class Buy_Two_Chocolates {
    
    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int cost = prices[0] + prices[1];

        if (money >= cost) {
            return money - cost;
        } else {
            return money;
        }
    }    
    
     public static void main(String[] args) {
        
        int[] prices = {1, 2, 2};
        int money = 5;

        int remaining = buyChoco(prices, money);
        System.out.println("Remaining money: " + remaining);
    }
}
