//キャスト変換
public class Main {
	public static void main(String[] args) {
		double doubleA = 1234.5678;
		int intA = 12345;
		intA = doubleA; //エラー
		System.out.println(intA);
	}
}
