package Strings_Know;

public class Count_phrases {

	public static void main(String[] args) {

      String stng = "Thisisthethesis";
      
      int l = stng.length();
      System.out.println(l);
      int st_the = 0;
      int st_is = 0;
      for (int i = 0; i < l; i++) 
      {
        if (i < l - 2) 
    	{
          String tmp = stng.substring(i,i+3);
          if (tmp.equals("the"))
            st_the++;
        }
        if (i < l - 1) 
    	{
          String tmp2 = stng.substring(i,i+2);
          if (tmp2.equals("is"))
            st_is++;
        }
      }
//      if (st_the == st_is)
//        return true;
//      else
//        return false;
//    }

  
	}
	

}
