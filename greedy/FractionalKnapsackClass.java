package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Item {
    int weight;
    int profit;

    Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
    }
}

public class FractionalKnapsackClass {
    private int N;
    private int W;
    private ArrayList<Item> itemList;

    public FractionalKnapsackClass(int W) {
        this.W = W;
        itemList = new ArrayList<>();
    }

    public void setN() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        N = input.nextInt();
    }

    public void setProductsWeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weights of the items: ");
        for (int i = 0; i < N; i++) {
            int weight = input.nextInt();
            itemList.add(new Item(weight, 0));
        }
    }

    public void setProductsProfit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the profits of the items: ");
        for (int i = 0; i < N; i++) {
            int profit = input.nextInt();
            itemList.get(i).profit = profit;
        }
    }

    public void doFractionalKnapsack() {
        double maxp = 0;

        // Sorting items based on their profit-to-weight ratio in descending order
        Collections.sort(itemList, Comparator.comparingDouble((Item item) -> (double) item.profit / item.weight).reversed());

        for (Item item : itemList) {
            int weight = item.weight;
            int profit = item.profit;

            if (weight <= W) {
                maxp += profit;
                W -= weight;
            } else {
                maxp += (double) profit * W / weight;
                W = 0;
            }
        }

        System.out.println("Maximum Profit in Knapsack: " + maxp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Maximum weight of knapsack: ");
        int W = input.nextInt();

        FractionalKnapsackClass obj = new FractionalKnapsackClass(W);

        obj.setN();
        obj.setProductsWeight();
        obj.setProductsProfit();

        obj.doFractionalKnapsack();
    }
}

