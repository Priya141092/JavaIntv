package Practise_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maximum_occuring_character_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k = "priyassssaxena";
		
		char [] m = k.toCharArray();
		//int count =0;
		
		int maxcount=0;
		
		for(int i=0;i<m.length;i++)
		{  
			int count=0;
			for(int j=i+1;j<=m.length-1;j++)
			{	
			if(m[i]==m[j])
			{
				
				count=count+1;
				
				 
			
			if(count>maxcount)
			{
				maxcount=count;
				System.out.println(count);
				System.out.println(m[i]);
				
			}
			}
			}
			
			
			
		}
		}
		
	


	}


