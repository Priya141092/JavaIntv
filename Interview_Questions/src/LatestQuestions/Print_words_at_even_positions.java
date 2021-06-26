package LatestQuestions;

public class Print_words_at_even_positions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p = "My name is Priya";
		
		//char [] m = p.toCharArray();
		String m[] =p.split(" ");
		
		for(int i=1;i<m.length;i=i+2)
		{
			System.out.print(m[i]);
		}

	}

}
