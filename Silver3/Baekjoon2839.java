package Silver3;

import java.util.Scanner;

public class Baekjoon2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while(n >= 0) {
			if(n % 5 == 0) {
				cnt += n / 5;
				n %= 5;
				System.out.println(cnt);
				return;
			}
			n -= 3;
			cnt++;
		}
		System.out.println(-1);
	}
}
