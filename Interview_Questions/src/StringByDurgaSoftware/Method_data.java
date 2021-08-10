package StringByDurgaSoftware;

public class Method_data {
	
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		//sb is stringbuider equals method is overridden by object so object comparison will be considered
		if(sb.equals(s)) 
		{
			System.out.println("Match1");
		}
		
		else if(sb.toString().equals(s.toString()))
		{
			System.out.println("Match2");
		}
		
		else
		{
			System.out.println("mo match");
		}
		
	}

}
