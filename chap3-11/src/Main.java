//サイコロのプログラム
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		int d = dice();
		System.out.println("サイコロは、" + d);
	}
	static int dice() {
		Random rnd = new Random();
		int ans = rnd.nextInt(6) + 1;
		return ans;
	}
}
