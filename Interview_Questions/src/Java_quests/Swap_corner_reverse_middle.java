package Java_quests;

public class Swap_corner_reverse_middle {

	public static void main(String[] args) {

     String h = "This is a cool cat";
     
     
     String k[] = h.split(" ");
     String temp = "";
     String rev = "";
     int g =1;
     String p = k[1];
     String f = k[k.length-1];
     
     
     
     for(int i=0;i<k.length;i++)
     {
    	  temp= k[0];
    	 k[0]=k[k.length-1];
    	 k[k.length-1]=temp;
    	 
    	
    	 
//    	 System.out.print(k[0]);
//    	 System.out.println(k[k.length-1]);
    	 
    	 
     }
     String d = k[0];
 	String s = k[k.length-1];
     
     for(int j=1;j<=k.length-2;j++)
     {
     rev = rev+" "+ k[j];
    // System.out.println(k[j]);
     
    	
    	 
     }
     
     StringBuffer sb = new StringBuffer(rev);
   	 sb.reverse();
   //	System.out.println(sb);
   	 System.out.print(d);
  	 System.out.print(" ");
 	 System.out.print(sb);
 	System.out.print(" ");
	 System.out.print(s);
    	 
    	 
//    	 StringBuffer sb = new StringBuffer(m);
//    	 sb.reverse();
//    	 System.out.println(sb);
    	 
    	 
    	 
     }
    
  
	}



