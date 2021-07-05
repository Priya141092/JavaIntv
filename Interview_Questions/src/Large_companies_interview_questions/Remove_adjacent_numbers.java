package Large_companies_interview_questions;

public class Remove_adjacent_numbers {

	public static void main(String[] args) {
		String s = "AABBBCCDD";
      char [] m = s.toCharArray();
        
        for(int i=0;i<m.length;i++)
        {    
            for(int j=i+1;j<m.length-1;j++)
            {
               if(m[i]==m[j] &&i!=j &&  i<i+2)
               {
                  m[i]=' ';
                  m[j]=' ';
               }
            }
            System.out.println(m[i]);
          
        }

	}

}
