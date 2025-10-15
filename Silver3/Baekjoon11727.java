package Silver3;

import java.util.Scanner;

public class Baekjoon11727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		// 예외처리
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		// 베이스케이스
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 3;
		
		
		// 점화식 : f(n-1) + f(n-2) + f(n-2)
		// = f(n-1) + 2 * f(n-2)
		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i-1] + (2 * dp[i-2]))% 10007;
		}
		System.out.println(dp[n]);
	}

}
