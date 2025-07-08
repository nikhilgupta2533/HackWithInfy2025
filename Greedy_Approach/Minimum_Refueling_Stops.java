package Greedy_Approach;

import java.util.*;

public class Minimum_Refueling_Stops {

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int fuel = startFuel, i = 0, refuels = 0, n = stations.length;

        while (fuel < target) {
            
            while (i < n && stations[i][0] <= fuel) {
                maxHeap.add(stations[i][1]);
                i++;
            }

            
            if (maxHeap.isEmpty()) return -1;

           
            fuel += maxHeap.poll();
            refuels++;
        }

        return refuels;
    }

    public static void main(String[] args) {
        int target = 100;
        int startFuel = 10;
        int[][] stations = {
            {10, 60},
            {20, 30},
            {30, 30},
            {60, 40}
        };

        int result = minRefuelStops(target, startFuel, stations);
        System.out.println("Minimum number of refueling stops: " + result);
    }
}
