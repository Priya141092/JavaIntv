package Large_companies_interview_questions;

public class Remove_adjacent_characters {

	public static void main(String[] args) {
	
		String a = "taaxzbbbz";
		
		char [] m = a.toCharArray();
		
		String rev = "";

      for(int i=0;i<=m.length-1;i++)
      {
    	  if(m[i]==m[i+1])
    	  {
    		  m[i]= ' ';
    		  m[i+1]=' ';
    		  
    		  continue;
    	  }
    	  System.out.println(m[i]);
      }

	}

}
