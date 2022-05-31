//くじ引きプログラム
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		int score = rnd.nextInt(100);
		if (score >= 90) {
			System.out.println("当たり！");
		} else {
			System.out.println("ハズレ");
		}
	}
}
