
package Demo3;

interface I1 {
    void xxx(); // Abstract method (implicitly public and abstract)
}

interface I2 {
    void yyy(); // Abstract method (implicitly public and abstract)
}
// Implementing the Shape interface in the Circle class
class C1 implements I1,I2 {
    // Implementing the draw() method
    public void xxx() {
        System.out.println("InterfaceTest1");
    }
    public void yyy() {
        System.out.println("InterfaceTest2");
    }
}


// Main class to test the interface implementation
public class Interface2 {
    public static void main(String[] args) {
       
        
        I1 i1 = new C1(); 
       i1.xxx();
       
       I2 i2= new C1();
       i2.yyy();
        
        
    }
}