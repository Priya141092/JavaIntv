package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class If_conditionss {
	
    


    
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        if(N%2==1)
        {
            System.out.println("Weird");
        }
        else if(N%2==0 && (N>=2 && N<=6))
        {
            System.out.println("Not Weird");
        }
        else if (N%2==0 && (N>=6 && N<20))
        {
            System.out.println("Weird");
        }
       else if(N%2==0 && N>20)
       {
           System.out.println("not Weird");
       }

        scanner.close();
    }
}
