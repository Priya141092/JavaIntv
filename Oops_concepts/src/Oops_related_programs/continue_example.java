package Oops_related_programs;

public class continue_example {

	public static void main(String[] args) {
		
		for (int j=0; j<=6; j++)
		{
	           if (j==4)
	           {
		      continue;
		   }

	           System.out.print(j+" ");
		}
// Output will be 012356, 4 is missing because as soon as 4 is encoutered, the the control will go to loop not the statement after that
	}

}
