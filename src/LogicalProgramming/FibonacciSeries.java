package LogicalProgramming;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Fibonacci series means a number sequence where each number is the sum of the previous two numbers.

        int n = 3;
        int a = 0; int b = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

    }
}
