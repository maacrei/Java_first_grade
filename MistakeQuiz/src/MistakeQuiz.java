import java.util.Random;
class MistakeQuiz extends CalcQuiz {  //間違い探しクイズを作るクラス
	MistakeQuiz() {  //コンストラクタ
		createQuestion();
	}
	void createQuestion() {  //問題を1つ作る
		String[] correct = {"氷", "問", "鳥", "緑", "塊"};  //正しい文字
		String[] mistake = {"水", "間", "烏", "縁", "魂"};  //間違い文字
		Random rnd = new Random();
		int qID = rnd.nextInt(correct.length);  //何番目を問題にするか
		int answerID = rnd.nextInt(10);  //何文字目が間違いか
		this.question = "";
		for (int i = 0; i < 10; i++) {
			if (i != answerID) {
				this.question += correct[qID];  //正解文字を足す
			} else {
				this.question += mistake[qID];  //間違い文字を足す
			}
		}
		this.question += ":この中で違う文字は何文字目？";  //問題の文字列
		this.answer = (answerID + 1 ) + "文字目";  //答えの文字列
	}
}
