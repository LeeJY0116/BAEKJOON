package Silver;

import java.util.Scanner;

public class Baekjoon11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 // n이 1일 경우 예외 처리
		if(n == 1) {
			System.out.println(1);
			return;
		}
		
		
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;

		
		// 점화식: dp[i] = dp[i-1] + dp[i-2]
		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;	// 중간 계산에서도 나머지 연산(오버플로우 방지)
		}
		System.out.println(dp[n]);
	}
}
