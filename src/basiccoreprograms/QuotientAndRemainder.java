package basiccoreprograms;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;
        if(divisor == 0){
            System.out.println("not divided by zero for any number");
            return;
        }

        int quotient = dividend/divisor;
        System.out.println("quotient " + quotient);
        int reminder = dividend%divisor;
        System.out.println("reminder " + reminder);
    }
}
