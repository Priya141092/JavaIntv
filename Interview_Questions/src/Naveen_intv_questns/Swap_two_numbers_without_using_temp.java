package Naveen_intv_questns;

public class Swap_two_numbers_without_using_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=5;
//		int t;
//		t=x;
//		x=y;
//		y=t;
		
		
		//1.method
		
		x=x+y;
		y=x-y;
		x=x-y;
	
		//by * multiplication
		 x=x*y;
		 y=x/y;
		 x=x/y;
		 
		 //3.Using XOR(^) oprator
		 x=x^y;
		 y=x^y;
		 x=x^y;
		 
		 System.out.println(x);
		 System.out.println(y);
		 

	}

}
