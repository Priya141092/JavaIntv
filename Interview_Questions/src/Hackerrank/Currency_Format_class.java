package Hackerrank;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Currency_Format_class {
	
	public void  getLocale(String Lang, String country)
	{
		
	}

	public static void main(String[] args) {
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat n3 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		
		Scanner sc = new Scanner(System.in);
		 double payment = sc.nextDouble();
		 String US =n1.format(payment);
		 String India =n3.format(payment);
		 String China =n2.format(payment);
		 String France =n.format(payment);
		 
		   System.out.println("US: " + US);
	        System.out.println("India: " + India);
	        System.out.println("China: " + China);
	        System.out.println("France: " + France);
		 
		 
		 
		 
		 
		
		

	}

}
