//数値を文字列に変換
public class Main {
	public static void main(String[] args) {
		int intA = 12345;
		double doubleA = 1234.5678;
		String stringA = Integer.toString(intA);
		String stringB = Double.toString(doubleA);
		System.out.println(stringA);
		System.out.println(stringB);
	}
}
