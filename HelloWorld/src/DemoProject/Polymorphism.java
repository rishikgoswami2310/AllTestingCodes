package DemoProject;



		// Polymorphism: Method Overloading and Method Overriding
	

		class B {
		    int i;
		    int j;

		    void input(int i, int j) {
		        this.i = i;
		        this.j = j;
		    }

		    void display() {
		        System.out.println("i=" + i + " j=" + j);
		    }
		}

		class D extends Base {
		    int k;

		    void input(int k) { // Overloaded method
		        this.k = k;
		    }

		    @Override
		    void display() { // Overridden method
		        super.display(); // Invokes Base class display()
		        System.out.println("k=" + k);
		    }
		}

		public class Polymorphism {
		    public static void main(String[] args) {
		        B b = new B(); 
		        b.input(10, 20); 
		        b.display(); 

		        D d = new D(); 
		        d.input(30, 40); 
		        d.input(50); 
		        d.display(); 
		    }
		}