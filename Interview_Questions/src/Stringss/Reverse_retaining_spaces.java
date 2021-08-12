package Stringss;

public class Reverse_retaining_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p = "My name is Priya";
		//ouput = ""
		
		
		
		char [] k = p.toCharArray();
		char [] result = new char [k.length];
		int j = result.length-1;
		
//		StringBuffer sb = new StringBuffer(p);
//		sb.reverse();
//		System.out.println(sb);
		
		
		for(int i=0;i<k.length;i++)
		{
			if(k[i]==' ')
			{
				result[j]=' ';
			}
			
			 if(k[i]!=' ')
			{
				
			
			 if(result[j]==' ')
			 {
				 j--;
			 }
			 result[j]=k[i];
			 j--;
			}
			
		}
		 System.out.println(String.valueOf(result));
		
		
		
	}

}
