package basiccoreprograms;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 10;
        int originalNum = n;
        System.out.print("Prime factors of " + n + " are: ");
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if (n == originalNum) {
            System.out.println(n);
            System.out.print(n + "is prime number");
        }else {
            System.out.println(n);
            System.out.print(originalNum + "is not prime number");

        }

    }
}
