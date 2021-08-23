package Oops_related_programs;

public class Demo1 implements intf2 {
	
	public void method1() {
	System.out.println("Method1");
		
	}

	
	public void method2() {
		System.out.println("Method2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intf2 h = new Demo1();
		h.method1();
		h.method2();

	}

	
	

}
