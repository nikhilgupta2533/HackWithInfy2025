package Greedy_Approach;

import java.util.*;

public class Minimum_Number_of_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter amount :");
        int amount=sc.nextInt();

        System.out.println("Enter No of coins :");
        int n=sc.nextInt();
        int[] coins=new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter value of coins :");
            coins[i]= sc.nextInt();
        }

        Arrays.sort(coins);
        int count=0;

        for(int i=coins.length-1; i>=0;  i--){
            while(amount >= coins[i]){
                amount-=coins[i];
                count++;
            }
        }
            System.out.println("Minimum coins Needed :"+ count);
    }
    
}
