package basiccoreprograms;

public class PowerOfTwo {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please provide N as a command-line argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if(N<0 || N>=31){
            System.out.println("Invalid input! N must be between 0 and 30.");
            return;
        }

        System.out.println("Powers of 2 table up to 2^" + N + ":\n");
        int power = 1;
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + power);
            power = power * 2;
        }
    }
}
