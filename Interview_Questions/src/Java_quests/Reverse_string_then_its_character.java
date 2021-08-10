package Java_quests;

public class Reverse_string_then_its_character {

	public static void main(String[] args) {
		
		String p = "My name is priya";
		
		String k [] = p.split(" ");
		
		
		
		for(int i=0;i<k.length;i++)
		{
			StringBuffer sb = new StringBuffer(k[i]);
			sb.reverse();
			System.out.println(sb.toString());
		}

	}

}
