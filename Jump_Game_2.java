

//Level :-Medium 
//Leetcode problem Link:-https://leetcode.com/problems/jump-game-ii/description/
public class Jump_Game_2 {

    public static int jump(int[] nums) {
        int jump=0;
        int l=0 , r=0;

        while(r < nums.length-1){
            int farthat=0;
            for(int i=0; i<=r; i++){
                farthat=Math.max(farthat , i + nums[i]);
            }
            l=r+1;
            r=farthat;
            jump++;
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps: " + jump(nums));
    }
    
}
