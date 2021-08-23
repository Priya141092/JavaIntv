package Strings_Know;

public class Duplicate_character_their_count {

	public static void main(String[] args) {
		
		String str = "Priyasaxena";
		int count = 0;
		
		
		char [] k = str.toCharArray();
		
		
		for(int i =0;i<k.length;i++)
			
		{
			for(int j =i+1;j<k.length;j++)
			{
				if(k[i]==k[j])
					
				{
					count = count+1;
					break;
					
				
			}
			
		}
		System.out.println(count);
		
		
	

	}

	}
}
