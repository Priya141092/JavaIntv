package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class List_as_an_input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++)
        {
        	int b = sc.nextInt();
        	al.add(b);
        }
       // System.out.println(al);
        
        int p = sc.nextInt();
        System.out.println("Insert");
        int k = sc.nextInt();
        int m = sc.nextInt();
        al.add(k,m );
        int h = sc.nextInt();
        al.remove(h);
        
        
        System.out.println(al);
        sc.close();
        

	}
	

}
