import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		int quizNum = 5;  //問題数
		Quiz [] quiz = new Quiz[quizNum];  //問題を作るインスタンスを入れる配列

		for (int i = 0; i < quizNum; i++) {  //問題を作るインスタンスを作る
			int qID = rnd.nextInt(3);  //ランダムに1つ選ぶ
			if (qID == 0) {
				quiz[i] = new MushikuiQuiz(); //虫食いクイズ
			} else if (qID == 1) {
				quiz[i] = new MistakeQuiz();  //間違い探しクイズ
			} else {
				quiz[i] = new TanukiQuiz();  //たぬきの言葉クイズ
			}
		}
		for (int i = 0; i < quizNum; i++) {  //すべての問題を表示する
			System.out.println("問" + i + ":" + quiz[i].getQuestion());
		}
		System.out.println("----------");
		for (int i = 0; i < quizNum; i++) {  //すべてのヒントを表示する
			System.out.println("ヒント" + i + ":" + quiz[i].getHint());
		}
		System.out.println("----------");
		for (int i = 0; i < quizNum; i++) {  //すべての答えを表示する
			System.out.println("答" + i + ":" + quiz[i].getAnswer());
		}
	}
}
