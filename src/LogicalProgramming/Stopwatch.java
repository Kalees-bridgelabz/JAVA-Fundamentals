package LogicalProgramming;

import java.util.Scanner;

public class Stopwatch {

    static long startTime;
    static long endTime;

    static void start() {
        startTime = System.currentTimeMillis();
    }

    static void stop() {
        endTime = System.currentTimeMillis();
    }

    static long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press ENTER to start the stopwatch");
        sc.nextLine();
        start();

        System.out.println("Press ENTER to stop the stopwatch");
        sc.nextLine();
        stop();

        System.out.println("Elapsed Time in milliseconds: " + getElapsedTime());
    }
}
