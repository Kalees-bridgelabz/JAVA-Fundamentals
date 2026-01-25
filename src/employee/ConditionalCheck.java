package employee;

public class ConditionalCheck {
    static int rate = 20;
    static int dutyHours = 8;
    static int noOfworkingDays = 20;
    public static void main(String[] args) {
     if(dutyHours == 100 || noOfworkingDays == 20){
         //to find wages for one day
         int dailyWages = rate*dutyHours;
         System.out.println("dailyWages "+dailyWages);

         //to find wages for total working days

         int monthlyWages = dailyWages*noOfworkingDays;
         System.out.println("monthlyWages " + monthlyWages);
     }else{
         System.out.println("doesn't meet duty hours or no of working hours");
     }
    }

}
