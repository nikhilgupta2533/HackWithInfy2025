import java.util.*;
public class Activity_Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr1 = new int [n][2];
        for (int i=0; i<n; i++)
        {
            arr1[i][0] = sc.nextInt();
            arr1[i][1] = sc.nextInt();

        }
        Arrays.sort(arr1, Comparator.comparing(a-> a[1]));
        int count = 0;
        int lastEndTime = 0;

        for(int i=0; i<n; i++)
        {
            int start = arr1[i][0];
            int end = arr1[i][1];

            if (start >=lastEndTime)
            {
                count++;
                lastEndTime = end;
            }
        }
        System.out.println(count);
    }
}