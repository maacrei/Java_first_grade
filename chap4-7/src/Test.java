class Test {      //同じ名前のフィールドとローカル変数があるクラスの例
	int x = 1;  //フィールドでもxを作れる
	void hello() {
		int x = 2;  //ローカル変数でもxを作れる
		System.out.println("x=" + x);  //ローカル変数のxを表示
	}
}
