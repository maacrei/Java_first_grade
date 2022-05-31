//配列の中の点数を足す拡張for文
public class Main {
	public static void main(String[] args) {
		int [] scorelist = {64, 100, 78, 80, 72};
		int total = 0;
		for(int i:scorelist) {
			total += i;
		}
		System.out.println(total);
	}
}
