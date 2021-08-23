package Strings_Know;

public class Dynamic_ends_with_similar {

	public static void main(String[] args) {
		
		String s1 = "Priya is a good girl";
		String s2 = "this is a nice girl";
		int lastindex=s1.lastIndexOf(s1);
		System.out.println(lastindex);
		int lastindex2 = s2.lastIndexOf(s2);
		
		String k[]=s1.split(" ");
		
		String m[]= s2.split(" ");
		
		for(int i=0;i<=k.length-1;i++)
		{
			
			for(int j=0;j<m.length-1;j++)
			{
				if(k[lastindex].equals(m[lastindex2]))
					
				{
					System.out.println(k[lastindex]);
				}
				
			}
				//System.out.println(k[i] );
		}
		
		
		
		
//		char[] m =s1.toCharArray();
//		
//		for(int i=0;i<=m.length-1;i++)
//		{
//			System.out.println(m[i] );
//		}
//		
		
		
	
		

	}

}
