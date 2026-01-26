package basiccoreprograms;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter year(4 digit only)");
        int year = sc.nextInt();
        if(year<1000 || year>9999){
            System.out.println("please enter valid number");
            return;
        }
        //boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

      boolean isLeap =  (year%400 == 0) || (year%4==0 && year%100 != 0);

        if(isLeap){
            System.out.println("year is leap year");
        }else{
            System.out.println("year is not leap year");
        }


    }
}
