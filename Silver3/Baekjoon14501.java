package Silver3;

import java.util.Scanner;

public class Baekjoon14501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int[] T = new int[N];
		int[] P = new int[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		
		int[] dp = new int[N + 1];
		
		// i일부터 시작해서 N-1일까지의 최대 수익 (뒤에서 앞으로)
		for(int i = N-1; i >= 0; i--) {
			if(i + T[i] <= N) {		// 상담 가능
				dp[i] = Math.max(dp[i + 1], P[i] + dp[i + T[i]]);	
			}
			else dp[i] = dp[i+1];	// 상담 불가 -> 건너뛰기
		}
		System.out.println(dp[0]);
	}
}
