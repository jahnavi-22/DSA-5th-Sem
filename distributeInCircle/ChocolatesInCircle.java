package distributeInCircle;

import java.util.Scanner;


public class ChocolatesInCircle {
    int start, choco, people;

    public ChocolatesInCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting position: ");
        start = scanner.nextInt();

        System.out.print("Enter chocolates: ");
        choco = scanner.nextInt();

        System.out.print("Enter value number of people: ");
        people = scanner.nextInt();
    }

    int getResult() {
        int x = (people + choco - 1) % start;

        if (x == 0) {
            return choco;
        }
        return x;
    }
    
    
    public static void main(String[] args) {
        int X;
        ChocolatesInCircle obj = new ChocolatesInCircle();
        X = obj.getResult();
        System.out.println("X: " + X);
    }
}



/*public class ChocolatesInCircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter number of children: ");
        n = input.nextInt();

        int choco;
        System.out.print("Enter number of chocolates: ");
        choco = input.nextInt();

        int startingPosition;
        System.out.print("Enter the starting position: ");
        startingPosition = input.nextInt();

        int last = (startingPosition + choco  - 1) % n;  // -1 because starting position will start from 1 not 0

        System.out.print("Last chocolate will be given to " + last);
    }
}*/