package Demo3;


class Employee {
    private int age; 

  
    void setAge(int a) {
        if (a >= 18 && a <= 60) {
            age = a;
        } else {
            System.out.println("Invalid Age");
        }
    }

    
    int getAge() {
        return age;
    }
}
    public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        
       
        // e.age = -20; 
        
        e.setAge(30); // Valid input
        System.out.println("Age: " + e.getAge()); // Output the age
    }
}
