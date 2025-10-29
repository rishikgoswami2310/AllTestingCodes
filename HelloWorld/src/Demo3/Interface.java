package Demo3;

interface Shape {
    void draw(); // Abstract method (implicitly public and abstract)
}

// Implementing the Shape interface in the Circle class
class Circle implements Shape {
    // Implementing the draw() method
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Square implements Shape {
    // Implementing the draw() method
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Main class to test the interface implementation
public class Interface {
    public static void main(String[] args) {
        // Shape s = new Shape(); // Error: 
        
        Shape s = new Circle(); 
        s.draw(); 
        
        Shape s1 = new Square(); 
        s1.draw();
    }
}