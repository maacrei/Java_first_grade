//計算問題作成プログラム
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			makeQuestion();
		}
	}
	static void makeQuestion() {
		Random rnd = new Random();
		int a = rnd.nextInt(100);
		int b = rnd.nextInt(100);
		String question = a + "x" + b + "=?";
		System.out.println(question);
	}
}
