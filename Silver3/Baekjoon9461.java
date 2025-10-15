package Silver3;

import java.util.Scanner;

public class Baekjoon9461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] dp = new long[101];	// int → long (값이 커질 수 있음)
		
		// 베이스케이스
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		
		
		// 규칙 = P[N] = P[N-1] + P[N-5]
		for(int j = 6; j < dp.length; j++) {
			dp[j] = dp[j-1] + dp[j-5];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			sb.append(dp[N]).append('\n');
		}
		System.out.println(sb);
	}
}
