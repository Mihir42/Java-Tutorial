public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Mark";
        System.out.println(employee.name); // public access modifier

        employee.setSalary(100000);
        System.out.println(employee.getSalary()); // private access modifier

        Mark mark = new Mark();
        mark.id = mark.id + "12345";
        System.out.println(mark.id); // protected access modifier

    }
}