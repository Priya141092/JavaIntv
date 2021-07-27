package Hackerrank;

import java.util.Scanner;

public class Eof {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        //String s = sc.hasNext();
	        int counter = 1;
	        
	        while (sc.hasNextLine()) {
	            String s = sc.nextLine();

	            System.out.println(counter + " " + s);
	            counter++;
	        }

	}

}
