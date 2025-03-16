package Bronze;

import java.time.LocalTime;
import java.util.Scanner;

public class Bronze3_2525 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		
		LocalTime time = LocalTime.of(A, B).plusMinutes(C);				// A시,B분에 C만큼 분을 더한다.
		System.out.printf("%s %s", time.getHour(),time.getMinute());
	}

}