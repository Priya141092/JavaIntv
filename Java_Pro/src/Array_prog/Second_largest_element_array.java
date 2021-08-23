package Array_prog;

public class Second_largest_element_array {

	public static void main(String[] args) {
	 int arr[] = {5,7,1,2,9};
	 
	 int largest = arr[0];
	 int secondLargest = arr[0];
	 
	 for(int i =0;i<=arr.length-1;i++)
	 {
		 if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		
	 }
	 System.out.println(""+secondLargest);

}
}
