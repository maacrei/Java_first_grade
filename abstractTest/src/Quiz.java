abstract class Quiz {  //抽象クラス
	//この抽象クラスを継承した子クラスは
	//以下のフィールドやメソッドを持っていることを保証する
	String question;  //問題を保存するフィールド
	String answer;  //答えを保存するフィールド

	abstract void createQuestion();

	String getQuestion() {    //その問題を教えてくれる
		return this.question;
	}
	String getAnswer() {    //その答えを教えてくれる
		return this.answer;
	}
}
