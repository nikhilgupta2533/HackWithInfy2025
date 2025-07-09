package Greedy_Approach;

import java.util.*;

public class Maximum_Events_You_Can_Attend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] events = new int[n][2];
        for (int i = 0; i < n; i++) {
            events[i][0] = sc.nextInt();
            events[i][1] = sc.nextInt();
        }
        Arrays.sort(events, Comparator.comparing(a -> a[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int day = 1;
        int i = 0;
        int res = 0;
        while (i < n || !minHeap.isEmpty()) {
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                res++;
            }
            day++;
        }
        System.out.println(res);
    }
}
