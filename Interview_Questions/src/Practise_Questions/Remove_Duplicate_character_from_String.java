package Practise_Questions;

public class Remove_Duplicate_character_from_String {

	public static void main(String[] args) {

     String p = "priyapasaxenaa";
     
     char [] m = p.toCharArray();
     
     
     for(int i=0;i<m.length;i++)
     {
    	for(int j=i+1;j<m.length;j++)
    	{
    		
    		if(m[i]==m[j])
    		{
    			System.out.println(m[i]);
    		}
    	}
    	 
     }
     
     
     
     

	}

}
