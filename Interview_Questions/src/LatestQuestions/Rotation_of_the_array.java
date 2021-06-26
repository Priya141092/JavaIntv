package LatestQuestions;

public class Rotation_of_the_array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		
		
	
		
		
		
		for(int j=0;j<2;j++)
		{
			
			int first =a[0];
		for(int i=0;i<a.length-1;i++)
		{
		
			a[i]=a[i+1];
			
			
		}
		a[a.length-1]=first;
		}
		
		
		

	
	for(int k = 0; k< a.length; k++){  
        System.out.print(a[k] + " ");  

    }

	}
}
