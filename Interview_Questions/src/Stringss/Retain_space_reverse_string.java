package Stringss;

public class Retain_space_reverse_string {

	public static void main(String[] args) {
		String str = "hi girl to boy";
	String d =	str.replace(" ", "");
	//System.out.println(d);
	StringBuffer sb = new StringBuffer(d);
	sb.reverse();
	     
	      
	      for(int i=0 ; i<str.length(); i++){
	      if(str.charAt(i)== ' '){
	         sb.insert(i, " ");
	         
//	      }
//	      else if(str.charAt(i)!=' ')
//	      {
//	    	  sb.insert(i, str.charAt(i));
//	      }
	   }
	  // sb.append("");
	   
	   System.out.println(sb);
		
		
		
		}
		
		
		
	}
	

}
