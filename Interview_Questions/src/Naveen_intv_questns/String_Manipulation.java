package Naveen_intv_questns;

public class String_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p = "My name is Priya";
		String k = "My name Is Priya";
//		System.out.println(p.length());
//		System.out.println(p.charAt(2));
		System.out.println(p.indexOf('a'));
		System.out.println(p.indexOf('a', p.indexOf('a')+1));
		System.out.println(p.indexOf("name"));
		//id returning -1 it is not available
		System.out.println(p.equals(k));
		System.out.println(p.equalsIgnoreCase(k));
		
		//To get substring
		System.out.println(p.substring(0, 4));//4 will be excluded
		
		//trim:
		String s = " hi how ";
		System.out.println(s.trim());//removes bfore space & after space
		
		System.out.println(s.replace(" ", ""));
		
		//split method
		String t = "Hello_world_test_selenium";
		String tv[]=t.split("_");
		for(int i=0;i<tv.length;i++)
			
		{
			System.out.println(tv[i]);
		}
		
		System.out.println(p.concat(k));
		
		String x = "Hello";
		String y ="World";
		int a=100;
		int b=200;
		System.out.println(x+y+100+200);
		System.out.println(a+b+x+y);
		

	}

}
