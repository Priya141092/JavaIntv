package Oops_related_programs;

public class contrs {

	
		
		int age;
		String name;
		
		//Default Constructor
		contrs(){
			this.name="Chaitanya";
			this.age=30;
		   }
		
		//Parameterised constructor
		contrs(String n, int a)
		{
			this.name=n;
			this.age=a;
		}
		public static void main(String[] args) {
			
			contrs b1  = new contrs();
            contrs b2 = new contrs("aa",9);
            System.out.println(b1.name+" "+b1.age);
        	System.out.println(b2.name+" "+b2.age);

	}

}
