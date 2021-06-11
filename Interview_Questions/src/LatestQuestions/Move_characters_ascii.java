package LatestQuestions;

public class Move_characters_ascii {

	public static void main(String[] args) {
		
		String p = "priya";
		int temp;
		
		char[]m = p.toCharArray();
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i]>m[j])
				{
					temp=m[i];
					m[i]=m[j];
					m[j]=(char) temp;
				}
			}
			System.out.println(m[i]);
		}
		
		

	}

}
