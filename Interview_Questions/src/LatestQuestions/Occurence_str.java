package LatestQuestions;

public class Occurence_str {

	public static void main(String[] args) {
		
		//Input = sssqqwws
		//Output = s3q2w2s
		
		int count =0;
		String p = "sssqqwwsq";
		String rev="";

       for(int i=0;i<p.length()-1;i++)
       {
    	   if(p.charAt(i)==p.charAt(i+1))
    	   {
    		   count=count+1;
    		   System.out.print(p.charAt(i)); 
    		   System.out.print(count);
    	   }
    	       

    	  
    	   
    	  
       }
       
	}
}
	

	


