package Bronze;

import java.util.Scanner;

public class Bronze5_26307 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hour = s.nextInt();
		int minute = s.nextInt();
		int currentHour = hour - 9;
		int result = (currentHour * 60) + minute;
		System.out.println(result);
	}
}
