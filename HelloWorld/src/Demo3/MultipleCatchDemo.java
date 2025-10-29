package Demo3;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		
		  try {
	            int n1 = Integer.parseInt(args[0]);
	            int n2 = Integer.parseInt(args[1]);
	            int res = n1 / n2;
	            System.out.println("Result = " + res);
	        } 
	        
	      
	        catch (Exception e) {
	            System.err.println("Exception occurred" + e);
	        }
	}

}
