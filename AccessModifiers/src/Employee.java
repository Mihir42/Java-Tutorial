public class Employee {

    public String name; // Access in all classes
    private int salary; // Access only in the declared class
    protected String id = "AB"; // Access in packages and child classes

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
