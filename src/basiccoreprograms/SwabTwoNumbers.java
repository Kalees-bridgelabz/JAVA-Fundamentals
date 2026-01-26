package basiccoreprograms;

public class SwabTwoNumbers {
    public static void main(String[] args) {
        /* swap two numbers without third variable using xor method
           Same bits → 0
           Different bits → 1*/

        int a = 3;
        int b = 5;
        System.out.println("swab before a = " + a + " swap before b= " + b);
        a = a^b; // 3 ==> 0011 5 ===>0101 finally i get = 6;
        b = a^b; // 6 ==> 0110 5===>0101  finaly i get  = 3;
        a=a^b; // 6 ===> 0110 3 === > 0011 finaly i get = 5;
        System.out.println("swab after a = " + a + " swap after b= " + b);

    }
}
