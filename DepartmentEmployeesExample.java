class Employee {
    String name = "Manoj";
    void showEmployee() {
        System.out.println("Employee Name: " + name);
    }
}
class Department {
    Employee e = new Employee();
    void showDepartment() {
        System.out.println("Department Employees:");
        e.showEmployee();
    }
}
public class StudentToString.java {
    public static void main(String[] args) {
        Department d = new Department();
        d.showDepartment();
    }
}