package DemoProject;


class Employee {
    int empNum;
    String empName;
    double empSalary;

    void setEmpDetails() {
        empNum = 111;
        empName = "Raj";
        empSalary = 8000.0;
    }

    void dispEmpDetails() {
        System.out.println("Emp Num = " + empNum);
        System.out.println("Emp Name = " + empName);
        System.out.println("Emp Salary = " + empSalary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpDetails();
        e1.dispEmpDetails();
    }
}