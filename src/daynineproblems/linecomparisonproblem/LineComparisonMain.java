package daynineproblems.linecomparisonproblem;
import java.util.*;

public class LineComparisonMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();

        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("\nEnter coordinates for Line 2");

        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();

        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        System.out.print("Enter x4: ");
        int x4 = sc.nextInt();

        System.out.print("Enter y4: ");
        int y4 = sc.nextInt();

        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));


        // Equality Check
        if (length1.equals(length2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }

        //System.out.println("Length of the line = " + length);
    }
}
