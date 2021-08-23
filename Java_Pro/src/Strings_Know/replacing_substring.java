package Strings_Know;

public class replacing_substring {

	public static void main(String[] args) {
	String m = "The quick brown fox jumps over the lazy dog";
	String k = "cat";
	
	String str = m.replaceAll("fox", "cat");
	System.out.println(str);
	}

}
