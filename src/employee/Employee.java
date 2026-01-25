package employee;

public class Employee {
    public String getEmployeeName() {
        return employeeName;
    }

    public boolean isPresent() {
        return isPresent;
    }

    String employeeName;
    boolean isPresent;


    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setPresent(boolean present){
        this.isPresent = present;
    }
}
