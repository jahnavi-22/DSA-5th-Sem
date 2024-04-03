 package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//
//class Item {
//    int weight;
//    int profit;
//
//    Item(int weight, int profit) {
//        this.weight = weight;
//        this.profit = profit;
//    }
//}

public class FractionalKnapsack {
    static class Pair {
        double first;
        Item second;

        Pair(double first, Item second) {
            this.first = first;
            this.second = second;
        }
    }

    static class PairComparator implements Comparator<Pair> {
        public int compare(Pair a, Pair b) {
            return Double.compare(b.first, a.first);
        }
    }

    double doFractionalKnapsack(int W, int[] pw, int[] pp) {
        int n = pw.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(pw[i], pp[i]);
        }

        Pair[] v = new Pair[n];
        for (int i = 0; i < n; i++) {
            double perUnit = (1.0 * items[i].profit) / items[i].weight;
            Pair p = new Pair(perUnit, items[i]);
            v[i] = p;
        }

        Arrays.sort(v, new PairComparator());

        double total = 0;
        for (int i = 0; i < n; i++) {
            if (v[i].second.weight > W) {
                total += W * v[i].first;
                W = 0;
            } else {
                total += v[i].second.profit;
                W -= v[i].second.weight;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        FractionalKnapsack obj = new FractionalKnapsack();
        int w, n;
        System.out.print("Enter Maximum weight: ");
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

        double mp = obj.doFractionalKnapsack(w, pw, pp);
        System.out.println("Maximum Profit in Knapsack: " + mp);
    }
}