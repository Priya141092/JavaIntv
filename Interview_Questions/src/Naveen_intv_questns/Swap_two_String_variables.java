package Naveen_intv_questns;

public class Swap_two_String_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello";
		String b = "world";
		
		a= a+b;
		
		b=a.substring(0,a.length()- b.length());
		 a=a.substring(b.length());
		 
		 System.out.println(a);
		 System.out.println(b);

	}

}
