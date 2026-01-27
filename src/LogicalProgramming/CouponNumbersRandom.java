package LogicalProgramming;

import java.util.Arrays;
import java.util.Random;

public class CouponNumbersRandom {

    static int collectCoupons(int n) {
        boolean[] collected = new boolean[n + 1]; // index 1 to n
        Random random = new Random();

        int totalCount = 0;
        int distinctCount = 0;

        while (distinctCount < n) {
            int value = random.nextInt(n) + 1; // 1 to n
            totalCount++;
            System.out.println("value" + value);
            if (collected[value] == false) {
                collected[value] = true;
                distinctCount++;
            }
        }

        System.out.println("collected " + Arrays.toString(collected));
        int distinctCoupon = collected.length - 1;
        System.out.println("distinct coupon " + distinctCoupon);
        return totalCount;
    }

    public static void main(String[] args) {
        int n = 5;

        int result = collectCoupons(n);
        System.out.println("Total random numbers needed: " + result);
    }
}
