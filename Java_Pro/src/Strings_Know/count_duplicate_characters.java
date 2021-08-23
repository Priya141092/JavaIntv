package Strings_Know;

public class count_duplicate_characters {

	public static void main(String[] args) {

        int count =0;
		String m = "priyapsa";
		
		char [] p = m.toCharArray();
		
		for(int i=0;i<=p.length-1;i++)
		{
			for(int j=i+1;j<=p.length-1;j++)
			{
				if(p[i]==p[j])
				{
					count= count+1;
					
				}
				System.out.println("Duplicate" +p[i]+ " count of is "+count);
			}
			
		}

	}

}
