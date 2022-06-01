public class Main {      //最初に実行するクラス
	public static void main(String[] args) {
		CalcQuiz q = new CalcQuiz();  //クイズを出すインスタンス

		System.out.println(q.getQuestion());  //問題を出す
		System.out.println(q.getAnswer());  //答えをいう
	}
}
