//消費税計算プログラム
public class Main {
	public static void main(String[] args) {
		double ans = postTaxPrice(980);
		System.out.println(ans + "円");
	}
	static double postTaxPrice(int price) {
		double ans = price * 1.1;
		return ans;
	}
}
