package DynamicProgramming;

public class ClimbingStair {
    public static int climb(int n) {
        if (n == 0 || n == 1) return 1;
        return climb(n - 1) + climb(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climb(n));
    }
}