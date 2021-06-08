package Java_quests;

public class Reverse_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,8,4,3,7};
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
