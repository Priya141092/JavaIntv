package Arrays_prac;

public class Array_contains_sepecific_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,4,6,9,8};
		 int b = 2;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==b)
			 {
				 System.out.println("it is present");
			 }
			 else
			 {
				 System.out.println("It is not present");
			 }
		 }

	}

}
