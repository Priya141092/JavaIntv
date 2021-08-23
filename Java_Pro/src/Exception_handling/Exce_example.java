package Exception_handling;

public class Exce_example {

	public static void main(String[] args) {
		
		        try 
		        {
		            System.out.print("A");
		            int num = 99/0;
		            System.out.print("B");
		        }
		        catch(ArithmeticException ex) 
		        {
		            System.out.print("C");
		        }
		        catch(Exception ex)
		        {
		            System.out.print("D");
		        }
		        System.out.print("E");
		    }
		

	}


