package greedy;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KnapsackProblem {

    private int w;
    private List<Itemm> itemList;

    static class Itemm {
        int weight, profit;
        double profit_per_unit_weight;

        Itemm(int w, int p) {
            this.weight = w;
            this.profit = p;
            this.profit_per_unit_weight = (double) p / w;
        }
    }

    public KnapsackProblem(int knapsackCapacity) {
        this.w = knapsackCapacity;
        this.itemList = new ArrayList<>();
    }

    public void addItem(int weight, int profit) {
        itemList.add(new Itemm(weight, profit));
    }

    public double doFractionalKnapSack() {
        Collections.sort(itemList, new Comparator<Itemm>() {
            public int compare(Itemm item01, Itemm item02) {
                if (item01.profit_per_unit_weight > item02.profit_per_unit_weight) return -1;
                return 1;
            }
        });

        double maxProfit = 0.0;

        for (Itemm item : itemList) {
            int weight = item.weight;
            int profit = item.profit;

            if (w >= weight) {
                maxProfit += profit;
                w -= weight;
            } else {
                maxProfit += (double) profit * w / weight;
                w = 0;
                break;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        KnapsackProblem knapsack = new KnapsackProblem(60); // Replace 10 with your knapsack capacity

        FractionalKnapsack obj = new FractionalKnapsack();
        int w, n;
        System.out.print("Enter Maximum Weight: ");
        Scanner in = new Scanner(System.in);
        w = in.nextInt();
        System.out.println();
        System.out.print("Enter Number of Items: ");
        n = in.nextInt();
        int[] pw = new int[n];
        int[] pp = new int[n];
        System.out.println("Enter Product weights: ");
        for (int i = 0; i < n; i++) {
            pw[i] = in.nextInt();
        }
        System.out.println("Enter Product Profits: ");
        for (int i = 0; i < n; i++) {
            pp[i] = in.nextInt();
        }

        double maxProfit = knapsack.doFractionalKnapSack();
        System.out.println("Max Profit: " + maxProfit);
    }
}