package StringByDurgaSoftware;

final class Testt {
	
	private int i;
	Testt(int i)
	{
		this.i=i;
	}
 
	
	public Testt modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		
		else
		{
			return new Testt(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Testt t1 = new Testt(10);
  Testt t2 = t1.modify(100);
  Testt t3 =t1.modify(10);	
  System.out.println(t1==t2);
  System.out.println(t1==t3);
	}

}
