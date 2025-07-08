package Greedy_Approach;

//Level :-easy 
//Leetcode problem Link:- https://leetcode.com/problems/di-string-match/description/
import java.util.Arrays;

public class DI_String_Match {
    
    public static int[] diStringMatch(String s) {
        int n=s.length();
        int low=0 , high=n;
        int[] perm=new int[n+1];

        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'I'){
                perm[i]=low++;
            }else{
                perm[i]=high--;
            }
        }

        perm[n]=low;
        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";

        int[] arr=diStringMatch(s);
        System.out.println(Arrays.toString(arr));
    }
}
