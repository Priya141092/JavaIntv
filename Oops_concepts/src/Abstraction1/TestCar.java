package Abstraction1;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b =new BMW();
		b.start();
		b.stop();
		b.refuel();
		
		Car c = new BMW();//Dynmaic ploymorphism
		c.start();
		c.stop();
		c.refuel();

	}

}
