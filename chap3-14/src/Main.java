//おみくじプログラム
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		omikuji(); //おみくじメソッドを呼び出す
	}
	static void omikuji() {
		String [] kuji = {"大吉", "中吉", "吉", "末吉", "凶"};
		Random rnd = new Random();
		int id = rnd.nextInt(kuji.length);
		System.out.println(kuji[id]);
	}
}
