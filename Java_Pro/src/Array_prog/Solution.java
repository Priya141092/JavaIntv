package Array_prog;

class Solution {
    public static void main(String args[]) {
        String []m = {"un","iq","ue"};
        int count = 0;
        String s = "";
        
        
        for(int i =0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length();j++)
            {
               for(int k=j+1;k<m[i].length();k++)
               {
                   if( m[j].charAt(j)!=m[k].charAt(k))
                   {
                	   
                	   m[j]="";
                	    s=s.concat(m[k]);
                       count=count+1;
                       System.out.println(s);
                      
                   }
                   
                   else if(m[j].equals(m[k]))
                   {
                	  count=count-1;
                   }
              
               }
              
            }
        }
        System.out.println(count);
        
    }
}

