package Naveen_intv_questns;

public class Reverse_an_intt {

	public static void main(String[] args) {

     int n=12345;
     int rev=0;
     
     while(n!=0)
     {
    	 
    	 rev = rev*10  + n % 10;
    	 n=n/10;
     }
     System.out.println();
	

	//Using String buffer Method
	
	System.out.println(new StringBuffer(String.valueOf(n)).reverse());
	
	}
}
