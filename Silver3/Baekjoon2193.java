package Silver3;

import java.util.Scanner;

public class Baekjoon2193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] dp = new long[91];
		
		// 베이스케이스 , 점화식 : f(n) = f(n-1) + f(n-2)
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 2;
		
		for(int i = 4; i <= N; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[N]);
	}
}
