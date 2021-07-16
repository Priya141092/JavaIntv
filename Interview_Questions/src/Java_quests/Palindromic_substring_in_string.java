package Java_quests;

public class Palindromic_substring_in_string {

	public static void main(String[] args) {

     String p = "aba";
     int count =0;
     
     for(int i=0;i<p.length();i++)
     {
    	 for(int j=i;j<p.length();j++)
    	 {
    		 String m = p.substring(i, j+1);
//    		 {
//    			// System.out.println(m);
//    		 }
    		 StringBuffer sb = new StringBuffer(m);
    	 		StringBuffer h = sb.reverse();
    	 		String v =h.toString();
    	 		//System.out.println(v);
    	 		
    	 		if(v.equals(m))
    	 		{
    	 			count=count+1;
    	 		}
    	 		
    	 		
    	 }
    	 
    	 
    	 
     }
     System.out.println(count);
     
     
     
     

	}
	
		
		
   	 
    }


