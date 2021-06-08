package Java_quests;

public class Second_Most_frequent {

	public static void main(String[] args) {
		
		String p = "Latestdataa";
		int count=0;
		
		char [] m = p.toCharArray();
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i]==m[j])
				{
					count=count+1;
					
				}
				System.out.println(m[i]);
				System.out.println(count);
			}
		}

	}

}
