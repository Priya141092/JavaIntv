package LatestQuestions;

import java.util.Arrays;

public class Pair_of_number_closest_0 {

	public static void main(String[] args) {

    int a[] = {1,3,-5,7,8,20,-60,6};
    
   Arrays.sort(a);
//    for(int i=0;i<a.length;i++)
//    {
//    System.out.println(a[i]);
//    }
//    
    
    
    int fele =a[0];
    int secele= a[1];
    int minimumsum=fele+secele;
    
    int tempsum=0;

     for(int i=0;i<a.length;i++) 
     {
    	 for(int j=i+1;j<a.length;j++)
    	 {
    		 tempsum=a[i]+a[j];
    		 
    		 if(Math.abs(tempsum)< Math.abs(minimumsum))
    		 {
    			 minimumsum=tempsum;
    			 fele=a[i];
    			 secele =a[j];
    			 
    		 }
    		 
    	 }
    	 
     }
     System.out.println("Pair is"  +fele+  "other is"   +secele);
	}

}
