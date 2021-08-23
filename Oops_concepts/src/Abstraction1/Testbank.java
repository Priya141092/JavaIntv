package Abstraction1;

public class Testbank {

	public static void main(String[] args) {


		HDFC hb = new HDFC();
		hb.loan();
		hb.credit();
		hb.funds();
		
		Bank b = new HDFC();
		b.loan();
		b.credit();
	

	}

}
