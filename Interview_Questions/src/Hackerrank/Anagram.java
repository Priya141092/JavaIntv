package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

static boolean isAnagram(String a, String b) {
        
        char [] m = a.toCharArray();
        char[] k = b.toCharArray();
       
        
        int n1 = m.length;
        int n2=k.length;
        
        if(n1!=n2)
        {
        	return false;
        }
      
           Arrays.sort(m);
           Arrays.sort(k);
           
           for(int i=0;i<n1;i++)
           
           
               if(m[i]!=k[i])
               
                   return false;
               
               
               
                   return true;
           
               
           
       
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next().toLowerCase();
        String b = scan.next().toLowerCase();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }



        
    

	}


