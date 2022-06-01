public class Main {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyClass iroha = new MyClass();      //各インスタンスの作成
		MyClass sensei  = new MyClass();

		myClass.hello();
		iroha.hello();      //各インスタンスのhelloメソッドにアクセス
		sensei.hello();
	}
}
