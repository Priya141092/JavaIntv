package Strings_Know;



public class print_every_character_twice {

	public static void main(String[] args) {
		
		String s = "Priya";
		
		char [] m = s.toCharArray();
		
		
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i]+""+m[i]);
		}
		
		
	}

}
