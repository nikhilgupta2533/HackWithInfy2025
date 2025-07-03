import java.util.Arrays;
import java.util.Scanner;

public class Fractional_Knapsack
{
    static class Items {
        int value;
        int weight;
        double ratio;

        Items(int v, int w)
        {
            value = v;
            weight = w;
            ratio = (double) v/w;
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();

        //To input the items...
        Items items [] = new Items[n];

        for (int i=0; i<n; i++)
        {
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Items(value,weight);

        }
        Arrays.sort(items, (a,b) ->Double.compare(b.ratio, a.ratio));

        double totalValue = 0.0;
        int currentWeight = 0;
        for(Items it:items) {
            if (currentWeight + it.weight <= w) {
                currentWeight += it.weight;
                totalValue += it.value;

            } else {
                int remaining = w - currentWeight;
                totalValue += it.ratio * remaining;
                break;
            }
        }
        System.out.println(totalValue);
    }
}
