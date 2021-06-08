package Java_quests;

public class Rotate_Array {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5};
		
		//output = Output = {2,3,4,5,1};
		
	 int first = a[0];
	
		
		for(int i=0;i<a.length-1;i++)
		{
			
			a[i]=a[i+1];
			
			
			//System.out.println(first);
		
			
		}
		
		a[a.length-1]=first;
		
		
		
	
	
    //Displays resulting array after rotation  
     
    for(int k = 0; k< a.length; k++){  
        System.out.print(a[k] + " ");  

    }
}
}
