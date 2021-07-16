package Java_quests;

public class Count_characters_sequentially {

	public static void main(String[] args) {
		
     String k = "agabbcdaaeed";
     String rev= "";
     char [] m = k.toCharArray();
     
     for(int i=0;i<m.length-1;i++)
     {    
    	 int count =1;
    	 if(m[i]==m[i+1])
    	 {
    		 count = count+1;
    		 
    		 i++;
    		 
    	 }
    	 
    	 if(count==1)
    	 {
    		 System.out.println(count);
    		 System.out.println(m[i]);
    		
    	 }
    	 else
    	 {
    		 System.out.println(count);
    		 System.out.println(m[i]);
    	 }
    	 
    	 
		

	}

	}
}
