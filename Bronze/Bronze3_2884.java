package Bronze;

import java.time.LocalTime;
import java.util.Scanner;

public class Bronze3_2884 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int H = s.nextInt();
		int M = s.nextInt();
		
		LocalTime time = LocalTime.of(H, M).minusMinutes(45);
		System.out.printf("%s %s", time.getHour(),time.getMinute());

	}

}
