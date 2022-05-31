import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		int a = rnd.nextInt(100);
		int b = rnd.nextInt(100);
		String question = a + "x" + b + "=?";
		System.out.println(question);
	}
}
