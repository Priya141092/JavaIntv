package Strings_Know;

public class Remove_specified_char {

	public static void main(String[] args) {

    String s = "abcdefggghhh";
    String s2 = "gh";
    
    String s3=s.replace("gh", "");
    
    System.out.println(s3);

	}
	
//	StringBuilder sb = new StringBuilder();
//    char[] chArray = str1.toCharArray();
//    for (int i = 0; i < chArray.length; i++) {
//        if (chArray[i] != g_char) {
//            sb.append(chArray[i]);
//        }

}
