package StringByDurgaSoftware;

public class MaskTest {
	
	
	public static String mask(String creditcard)
	{
		String x = "XXXX-XXXX-XXXX-";
		//return x + creditcard.substring(15,19);
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditcard, 15, 19);
		return sb.toString();
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mask("1234-5679-9101-5979"));

	}

}
