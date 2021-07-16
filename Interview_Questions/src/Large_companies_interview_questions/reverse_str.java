package Large_companies_interview_questions;

public class reverse_str {

	public static void main(String[] args) {
		
		String p = "Priya";
		
		char [] m = p.toCharArray();
		
		for(int i=m.length-1;i>=0;i--)
		{
			System.out.println(m[i]);
		}
		
//		StringBuffer sb = new StringBuffer(p);
//		
//		StringBuffer k = sb.reverse();

	}

}
