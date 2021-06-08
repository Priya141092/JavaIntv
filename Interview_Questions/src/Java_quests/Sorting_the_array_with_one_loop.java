package Java_quests;

public class Sorting_the_array_with_one_loop {

	public static void main(String[] args) {
	
		int temp;
		int a[] = {1,5,3,4,2,8,7};
		
		for(int i=0;i>a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
			i=-1;
			}
			
			for(int k=0;k<a.length-1;k++) {
			System.out.println(a[k]);
			}
		}
	
		
	}

}
