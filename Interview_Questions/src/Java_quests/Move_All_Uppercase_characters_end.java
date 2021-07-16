package Java_quests;

public class Move_All_Uppercase_characters_end {

	public static void main(String[] args) {
	
		String p = "ThisIsACuteGirl";
		String rev = "";
		
		//char[] m =p.toCharArray();
		
		for(int i=0;i<p.length()-1;i++)
		{
			if(p.charAt(i) >= 65 && p.charAt(i) <= 90)
			{
				rev=rev+p.charAt(i);
			}
			
			else
			{
				System.out.print(p.charAt(i));
			}
		}
		
		System.out.print(rev);
		
		

	}

}
