package DemoProject2;


class Employee {
    int empNum;
    String empName;
    double empSalary;

    void setEmpDetails(int eno, String ename, double salary) {
        empNum = eno;
        empName = ename;
        empSalary = salary;
    }

    void dispEmpDetails() {
        System.out.println("Emp Num = " + empNum);
        System.out.println("Emp Name = " + empName);
        System.out.println("Emp Salary = " + empSalary);
    }
}

public class EmployeeTest1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpDetails(111, "Raj", 8000.0);
        e1.dispEmpDetails();

        Employee e2 = new Employee();
        e2.setEmpDetails(222, "Ramu", 6000.0);
        e2.dispEmpDetails();
    }
}