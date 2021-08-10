package StringByDurgaSoftware;

public class Test5 {

	public static void main(String[] args) {

//   StringBuffer sb = new StringBuffer("Aishwaryaabhi");
//   sb.setLength(8);
//   System.out.println(sb);
		
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.ensureCapacity(1000);
//		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer(1000 );
		sb1.append("abc");
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity() );
		

	}

}
