public class Main {
	public static void main(String[] args) {
		sayhello();
		sayhello();  //あいさつを表示するメソッドの呼び出し
		sayhello();
	}
	static void sayhello() {
		System.out.println("こんにちは");  //作成したあいさつを表示するメソッド
	}
}
