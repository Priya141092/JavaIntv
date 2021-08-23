package Arrays_prac;

public class All_1s_end_all_0s_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,0,0,1,0,0,1};
		//output = {0,0,0,0,1,1,1}
		
		
		int left=0;
		int right = a.length-1;
		
		while(left<right)
		{
			while(a[left]==0 && left<right)
				left++;
			
			while(a[right]==1 && left<right)
				right--;
			
			if(left<right)
			{
				a[left] = 0;
                a[right] = 1;
                left++;
                right--;
			}
		}

       for(int i=0;i<a.length;i++)
       {
    	   System.out.println(a[i]);
       }
		
		
			
			
		}

	}


