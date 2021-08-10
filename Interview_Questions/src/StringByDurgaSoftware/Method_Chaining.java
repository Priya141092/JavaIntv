package StringByDurgaSoftware;

public class Method_Chaining {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("durga").append("solutions").reverse().insert(2, "xyz");
		System.out.println(sb);

	}

}
