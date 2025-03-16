package Bronze;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Bronze5_16170 {
	public static void main(String[] args) {
		Date dates = new Date();
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
		simpleDate.setTimeZone(TimeZone.getTimeZone("UTC"));
		String[] date = simpleDate.format(dates).split("-");
		for(String e : date) {
			System.out.println(e);
		}
	}
}
