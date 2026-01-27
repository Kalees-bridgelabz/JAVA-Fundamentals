package LogicalProgramming;

public class PerfectNumber {
    public static void main(String[] args) {
    //A number which is equal to the sum of its positive divisors (factors) except the number itself.

        int num = 5;
        int sum = 0;

        for(int i = 1 ;i<= num/2 ; i++){
            if(num%i == 0)
                sum += i;
        }
        if (sum == num && num > 0) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }
    }
}
