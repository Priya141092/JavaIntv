package StringByDurgaSoftware;

public class Practise_Ques {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = new String("java");
		
		//String s3=s2;
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Equal");
		}
		
		else
		{
			System.out.println("Not equal");
		}

	}

}
