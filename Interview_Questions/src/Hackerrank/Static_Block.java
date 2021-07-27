package Hackerrank;

import java.util.Scanner;

public class Static_Block {
	
	public static void Area1(int breadth1,int height1)
    {
     long Area;
    
   
    
    if(height1 >=0 && breadth1 >=0)
    {
        Area= breadth1*height1;
        System.out.println(Area);
    }
    else
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int breadth1 = sc.nextInt();
		    int height1 = sc.nextInt();
		Static_Block.Area1(breadth1,height1);

	}

}
