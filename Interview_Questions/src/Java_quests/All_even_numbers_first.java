package Java_quests;

public class All_even_numbers_first {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7,8};
		
		int leftside = 0;
		int rightside=a.length-1;
		int temp;
		
		
		while(leftside<rightside)
		{
		
		while(a[leftside]%2==0 && leftside<rightside)
			
		
			leftside++;
		
		
		while(a[rightside]%2==1 && leftside<rightside)
		
			rightside--;
		
		
		
		
		if (leftside < rightside)
        {
            temp = a[leftside];
            a[leftside] = a[rightside];
            a[rightside] = temp;
            leftside++;
            rightside--;
            
        }
		
        
		}
		for(int i=0;i<=a.length-1;i++)
        {
        	System.out.println(a[i]);
        }
		
		
//		while(leftside<rightside)
//		{
//			temp=a[leftside]
//		}
//		
		
//		for(int i=0;i<a.length-1;i++)
//		{
//			
//			if(a[i]%2==0 )
//			{
//				
//				a[i]=a[i];
//				i++;
//				
//			}
//			
//			else if(a[i]%2==1)
//			{
//				a[a.length-1]=a[i];
//				i--;
//			}
//			//System.out.println(a[i]);
//			
//		}
		
//		for(int j=0;j<a.length-1;j++)
//		{
//			System.out.println(a[j]);
//		}
		
		
		

	}

}
