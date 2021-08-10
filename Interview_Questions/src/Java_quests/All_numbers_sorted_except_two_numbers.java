package Java_quests;

public class All_numbers_sorted_except_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "food";
		String b = "door";
		
		char k = a.charAt(a.length()-1);
		char m = b.charAt(0);
		if(k==m)
		{
			StringBuffer sb = new StringBuffer(a);
			sb.deleteCharAt(a.length()-1);
			sb.append(b);
			System.out.println(sb);
		}
			
		
		
		
		
		
		
		
		

	}

}
