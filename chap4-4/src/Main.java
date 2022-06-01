public class Main {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyClass iroha = new MyClass();      //各インスタンスの作成
		MyClass sensei = new MyClass();
		
		iroha.myName = "いろは";      //インスタンスのmyNameフィールドに値を入れる
		sensei.myName = "センセイ";   //インスタンスのmyNameフィールドに値を入れる
		
		myClass.hello();
		iroha.hello();      //各インスタンスのhelloメソッドにアクセス
		sensei.hello();
	}
}
