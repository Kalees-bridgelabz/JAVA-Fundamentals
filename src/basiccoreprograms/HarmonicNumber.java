package basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter valid number it's start from 1");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("please enter valid number it's start from 1");
            return;
        }

        double harmonic = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonic = harmonic + (1.0 / i);
        }
        System.out.println("Nth Harmonic Value = " + harmonic);
        sc.close();
    }
}
