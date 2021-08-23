package Strings_Know;

import java.util.Scanner;

public class Remove_all_white_space {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        //Taking noOfRows value from the user
 
//        System.out.println("Enter the String please");
//        String str = sc.nextLine();
		String str = "gfg gg gg hg";
		String [] k = str.split(" ");
		
		//replaceAll("\s+", "");
        
        
//        	char m[] = str.toCharArray();
//        	
     	for(int i=0;i<k.length;i++)
        	{
        		System.out.print(k[i]);
        	}
       
        
        
        
       // System.out.println(str);
	}

}
