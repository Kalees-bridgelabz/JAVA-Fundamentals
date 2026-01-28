package oops.employee;


public class Employee implements EmployeeCalculation {

    boolean isPresent = false;
    private int hour;
    private int salary;
    private int days;
    private int totalWorkingHours;
    private int totalWorkingDays;

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    public void setTotalWorkingHours(int totalWorkingHours) {
        this.totalWorkingHours = totalWorkingHours;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }




    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }



    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }


    @Override
    public int calculateSalary(int hour, int salary) {
        return hour*salary;
    }

    @Override
    public int calculateSalary(int days, int hour, int salary) {
        int dailyWages = hour*salary;
        return dailyWages*days;
    }


}

 class Office {
     public static void main(String[] args) {
         Employee emp = new Employee();
         emp.isPresent = true;
         int dailyWages = emp.calculateSalary(8,20);
         int partTimeWages = emp.calculateSalary(8,20);
         emp.setTotalWorkingHours(50);
         emp.setTotalWorkingDays(10);
         int workingHours = emp.getTotalWorkingHours();
         int workingDays = emp.getTotalWorkingDays();

         int calculatePerMonthSalary = emp.calculateSalary(20,8,20);


         if(emp.isPresent()){
             System.out.println("employee is present");
         }else{
             System.out.println("employee is not present");
         }



         System.out.println("dailyWages " + dailyWages);
         System.out.println("partTimeWages " + partTimeWages);
         System.out.println("calculatePerMonthSalary " + calculatePerMonthSalary);

         if(workingHours == 100 || workingDays == 20){
             calculatePerMonthSalary = emp.calculateSalary(20,8,20);
             System.out.println("calculatePerMonthSalary " + calculatePerMonthSalary);


         }else{
             System.out.println("you doesn't meet for getting salary requirements");
         }

     }


 }


