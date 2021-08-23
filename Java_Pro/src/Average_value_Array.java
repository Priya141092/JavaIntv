
public class Average_value_Array {

	public static void main(String[] args) {
		
		int b[]= {1,4,6,8};
		int sum=0;
		int av_value=0;
		
		for(int i=0;i<b.length;i++)
		{
			sum=sum+b[i];
			
	
		}
		av_value=sum/b.length;
		System.out.println(av_value);
		

	}

}
