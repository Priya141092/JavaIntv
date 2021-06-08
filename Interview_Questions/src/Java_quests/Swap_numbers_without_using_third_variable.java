package Java_quests;

public class Swap_numbers_without_using_third_variable {

	public static void main(String[] args) {


		int x = 20;
		int y = 30;
		
		x= x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
