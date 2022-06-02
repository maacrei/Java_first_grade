import java.util.Random;
class CalcQuiz {  //計算問題を作るクラス
	String question;  //問題を保存するフィールド
	String answer;  //答えを保存するフィールド

	CalcQuiz() {  //コンストラクタ
		createQuestion()
;	}
	void createQuestion() {  //問題を1つ作る
		Random rnd = new Random();
		int a = rnd.nextInt(100);
		int b = rnd.nextInt(100);
		this.question = a + "x" + b + "=?";  //問題を文字列で作る
		this.answer = Integer.toString(a * b);  //答えを文字列で作る
	}

	String getQuestion() {    //その問題を教えてくれる
		return this.question;
	}
	String getAnswer() {    //その答えを教えてくれる
		return this.answer;
	}
}
