import employee.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //creating employee object

        Employee emp = new Employee();
        emp.setEmployeeName("kalees");
        emp.setPresent(true);
        if(emp.isPresent() == true){
            System.out.println("employee is present");
        }else{
            System.out.println("employee is not present");
        }

    }
}