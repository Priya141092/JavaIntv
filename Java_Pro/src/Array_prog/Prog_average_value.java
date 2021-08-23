package Array_prog;

public class Prog_average_value {


	public static void main(String[] args) {

    int a[]= {9,3,1,7};
    int temp;
    float sum = a[0];
    int max = a[0];
    int min = a[0];
    for(int i=0;i<=a.length-1;i++)
    {
    	
    	sum = sum=a[i];
    	 if(a[i]>=max)
    	 {
    		 max=a[i];
    
    	 }
    	 
    	 else if(a[i]<=min)
    	 {
    		 min=a[i];
    		 
    	 }
    	
    	
    }
    float x = ((sum-max-min)/(a.length-2));
	System.out.println(x);
    
//    for(int i=0;i<=a.length-1;i++)
//    {
//    	
//    	for(int j=i+1;j<=a.length-1;j++)
//    
//      if(a[i]>a[j])
//     {
//	  
//    	  temp=a[i];
//    	  a[i]=a[j];
//    	  a[j]=temp;
//     }
//      System.out.println(a[i]);
//      
      
     
    }
 


	

}
