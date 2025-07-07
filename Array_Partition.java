

//Level :-easy 
//Leetcode problem Link:-https://leetcode.com/problems/array-partition/description/

import java.util.Arrays;
public class Array_Partition {

    public static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length; i+=2){
            sum+=nums[i];
        }
        return sum;  
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};

        int ans = arrayPairSum(nums);
        System.out.println("Max sum of min pairs: " + ans);
    }
}
