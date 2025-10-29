package DemoProject2;

class Emp {
    int empNum;
    String empName;
    double empSalary;

    void setEmpDetails(int empNum, String empName, double empSalary) {
        this.empNum = empNum;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    void dispEmpDetails() {
        System.out.println("Emp Num = " + empNum);
        System.out.println("Emp Name = " + empName);
        System.out.println("Emp Salary = " + empSalary);
    }
}

public class ThisReference {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setEmpDetails(111, "Raj", 8000.0);
        e1.dispEmpDetails();

        Emp e2 = new Emp();
        e2.setEmpDetails(222, "Ramu", 6000.0);
        e2.dispEmpDetails();
    }
}