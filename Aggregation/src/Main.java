/*
Aggregation - Represents a "Has a" relationship
              One class contains an instance of a second class
              The contained class can exist on its own
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company ballards = new Company("Ballards", 0);
        System.out.println(ballards.getName());
        System.out.println(ballards.getEmployees());

        Employee dave = new Employee(1, "Dave", "Janitor");
        Employee sarah = new Employee(2, "Sarah", "Receptionist");
        Employee micheal = new Employee(3, "Micheal", "Manager");

        ballards.addEmployees(dave);
        ballards.addEmployees(sarah);
        ballards.addEmployees(micheal);

        System.out.println(ballards.getEmployees());

        List<Employee> employees = ballards.getEmployees();
        for(Employee e : employees) {
            System.out.println(e.getEmployeeId());
            System.out.println(e.getName());
            System.out.println(e.getJobTitle());
        }
    }
}