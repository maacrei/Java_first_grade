import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String[] args) {
		//現在の時刻を変数nowに入れる
		ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
		//時分秒を取得し、つなげた文字列にする
		String nowTime = now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
		System.out.println(nowTime);
	}
}
