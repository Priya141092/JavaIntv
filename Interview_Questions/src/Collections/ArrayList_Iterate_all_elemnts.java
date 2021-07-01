package Collections;

import java.util.ArrayList;

public class ArrayList_Iterate_all_elemnts {

	public static void main(String[] args) {


		ArrayList<String> al = new ArrayList<String>();
		al.add("Aa");
		al.add("Bb");
		al.add("Cc");
		
		for(String el:al)
		{
			System.out.println(el);
		}
		

	}

}
