package employee;

public class CalculateDailyEmployeeWage {

    static int rate = 20;
    static int dutyHours = 8;
    public static void main(String[] args) {
        int dailyWages = rate*dutyHours;
        System.out.println("dailyWages "+dailyWages);
    }
}


