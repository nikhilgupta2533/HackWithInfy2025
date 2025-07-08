package Greedy_Approach;

import java.util.*;

class Job {
    String id;
    int deadline, profit;

    Job(String id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Job_Sequencing_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();
        Job[] jobs = new Job[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter job id, deadline, profit: ");
            String id = sc.next();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            jobs[i] = new Job(id, deadline, profit);
        }

        
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        String[] slots = new String[maxDeadline + 1]; 
        Arrays.fill(slots, null);

        int totalProfit = 0;

        for (Job job : jobs) {
            for (int t = job.deadline; t >= 1; t--) {
                if (slots[t] == null) {
                    slots[t] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Maximum Total Profit: " + totalProfit);
        System.out.print("Scheduled Jobs: ");
        for (int i = 1; i < slots.length; i++) {
            if (slots[i] != null) {
                System.out.print(slots[i] + " ");
            }
        }
    }
}
