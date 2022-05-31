//何の段の九九でしょうクイズのプログラム
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random rnd = new Random(); //ランダムな数を出す部品
		int answer = rnd.nextInt(10); //ランダムで出た数を掛ける回数
		String question = ""; //問題文変数
		for(int i = 0; i <= 9; i++) {
			//問題文変数に、[ answer*i ]を足していく
			question = question + "[" + (answer * i) + "]";
		}
		System.out.println("何の段の九九でしょう？");
		System.out.println(question);
		System.out.println("答え:" + answer);
	}
}
