package StringByDurgaSoftware;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ta = "A";
		ta=ta.concat("B");
		String tb = "C";
		ta=ta.concat(tb);
		ta.replace('C', 'D');
		ta=ta.concat(tb);
		System.out.println(ta);

	}

}
