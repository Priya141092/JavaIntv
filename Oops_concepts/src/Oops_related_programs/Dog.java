package Oops_related_programs;

public class Dog extends Animal {
	
	
		public void sound()
		{
			System.out.println("Woof");
		}
		
		public void test()
		{
			System.out.println("Bye");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//We cannot create object of abstract class
			Dog d = new Dog();
			d.sound();
			d.test();
			System.out.println();
			

		}


}
