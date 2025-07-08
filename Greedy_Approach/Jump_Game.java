package Greedy_Approach;

//Level :-Medium
//Leetcode problem Link:- https://leetcode.com/problems/jump-game/description/
public class Jump_Game {

    public static boolean canJump(int[] nums) {

        int maxIndex=0;

        for(int i=0; i<nums.length; i++){
            if(i > maxIndex){
                return false;
            }
            else{
                maxIndex=Math.max( maxIndex , i+ nums[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        System.out.println("Reach the last index :"+canJump(nums));
    }
}
