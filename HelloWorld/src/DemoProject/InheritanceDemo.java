package DemoProject;

class Base {
    int i, j;

    void inputIJ(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void displayIJ() {
        System.out.println("i=" + i + " j=" + j);
    }
}

class Derived extends Base {
    int k;

    void inputK(int k) {
        this.k = k;
    }

    void displayK() {
        System.out.println("k=" + k);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Base b = new Base();  
        b.inputIJ(10, 20);    
        b.displayIJ();        

        Derived d = new Derived();  
        d.displayIJ();              
        d.inputIJ(30, 40);         
        d.displayIJ();             
        d.inputK(50);              
        d.displayK();              
    }
}
