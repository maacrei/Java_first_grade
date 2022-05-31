//文字列を数値に変換
public class Main {
	public static void main(String[] args) {
		String stringA = "12345";
		String stringB ="1234.5678";
		int intA = Integer.parseInt(stringA);
		double doubleA = Double.parseDouble(stringB);
		System.out.println(intA);
		System.out.println(doubleA);
	}
}
