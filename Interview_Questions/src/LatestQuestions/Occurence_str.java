package LatestQuestions;

public class Occurence_str {

	public static void main(String[] args) {
		
		//Input = sssqqwws
		//Output = s3q2w2s
		
		
		String p = "sssqqwwsq";
		String rev="";
		int n= p.length();

       for(int i=0;i<n;i++)
       {
    	   int count =1;
    	   while(i<n-1 && p.charAt(i)==p.charAt(i+1))
    	   {
    		   count ++;
    		   i++;
    	   }
    	   
    	   if(count==1)
    	   {
    		   System.out.print(p.charAt(i));
    	   }
    	   else 
    	   {
    		   System.out.print(p.charAt(i));
    		   System.out.print(count);
    	   }
    		   
    	  
    	       

    	  
    	   
    	  
       }
       
	}
}
	

	


