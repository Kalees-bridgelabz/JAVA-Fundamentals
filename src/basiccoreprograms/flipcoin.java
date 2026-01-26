package basiccoreprograms;

import java.util.Scanner;

public class flipcoin {
    public static void main(String[] args) {
        // first get how many times flip coin value
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of times to flip coin: ");
        int n = sc.nextInt();

        // check n value is positive integer

        if(n<=0) {
            System.out.println("enter the positive integer only");
            return;
        }

        // initialize head and tail count and it's initially zero

        int headCount = 0;
        int tailCount = 0;

        for (int i = 1; i <= n; i++) {
            double random = Math.random(); // gives value between 0.0 and 1.0

            if (random < 0.5) {
                tailCount++;
            } else {
                headCount++;
            }
        }

        double headPercent = (headCount * 100.0) / n;
        double tailPercent = (tailCount * 100.0) / n;

        System.out.println("\nTotal Flips = " + n);
        System.out.println("Heads Count = " + headCount);
        System.out.println("Tails Count = " + tailCount);
        System.out.println("Heads Percentage = " + headPercent + "%");
        System.out.println("Tails Percentage = " + tailPercent + "%");
    }
}
