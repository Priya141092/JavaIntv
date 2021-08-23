package Strings_Know;

public class Str_middle_str {

	public static void main(String[] args) {
		String s = "sweettoastbuttertoast";
		
		String substring1 = "toast";
		
		if(s.contains(substring1))
		{
		
		String [] m=s.split("toast");
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
		
		
		
		}

	}

}
