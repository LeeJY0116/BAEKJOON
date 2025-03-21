package Bronze;

import java.util.Scanner;

public class Bronze1_1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int num = N;
		int cnt = 0;
		
		do {
			int fir = num / 10;
			int sec = num % 10;
			int result = fir + sec;
			
			num = (sec * 10) + (result % 10);
			cnt++;
		}while(num != N);
		System.out.println(cnt);
	}
}
