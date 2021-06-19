package Naveen_intv_questns;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Selenium";
		String w = "Hello World";//Using string buffer we can reverse the words as well of the words
		
		//Using selenium
		//We cannot use reverse function because string is immutable
		
		int len = w.length();// length is 8 because it started from 0
		String rev =  "";
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+w.charAt(i);
		}
      System.out.println(rev);
		
		//Using String buffer class
//		StringBuffer sf = new StringBuffer(s);//stringbuffer is mutable class
//		System.out.println(sf.reverse());
		
	}

}
