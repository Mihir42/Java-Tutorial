import java.util.List;
import java.util.ArrayList;

public class Company {

    private String name;
    private int totalEmployees;
    private List<Employee> employees = new ArrayList();

    public Company(String name, int totalEmployees) {
        this.name = name;
        this.totalEmployees = totalEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee employee) {
        this.employees.add(employee);
    }
}
