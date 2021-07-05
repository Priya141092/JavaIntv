package Naveen_intv_questns;

public class Finallyconcept {

	public static void main(String[] args) {
        //test1();
        test2();
	}

		public static void test1()
		{
			
			try
			{
				System.out.println("try");
				throw new RuntimeException("test");
			}
			catch(Exception e)
			{
				System.out.println("catch");
			}
			finally
			{
				System.out.println("finally");
			}
		}
		
		public static void test2()
		{
			
			try {
			System.out.println("try2");
			}
			finally
			{
				System.out.println("finally2");
			}
		}
		
		public static void division()
		{  int i=10;
			try
			{
				System.out.println("try3");
				int k =i/0;
			}
			catch(NullPointerException e)
			{
				System.out.println("catch exception");
			}
			finally
			{
				System.out.println("finally3");
			}
		}

	}


