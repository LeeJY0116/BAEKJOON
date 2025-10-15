package Silver3;

import java.util.Scanner;

public class Baekjoon1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// dp[i][0] : fibonacci(i) 호출 시 0이 출력되는 횟수
		// dp[i][1] : fibonacci(i) 호출 시 1이 출력되는 횟수
		int[][] dp = new int[41][2];

		// 초기 조건 설정
		dp[0][0] = 1; dp[0][1] = 0; // fibonacci(0)
		dp[1][0] = 0; dp[1][1] = 1; // fibonacci(1)

		int T = sc.nextInt(); // 테스트 케이스 수

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt(); // 테스트 케이스마다 입력받는 피보나치 수

			// 필요한 만큼만 dp 배열 계산
			for (int j = 2; j <= N; j++) {
				dp[j][0] = dp[j - 1][0] + dp[j - 2][0]; // 0의 개수 갱신
				dp[j][1] = dp[j - 1][1] + dp[j - 2][1]; // 1의 개수 갱신
			}

			// 결과 출력: fibonacci(N) 호출 시 0과 1이 각각 몇 번 출력되는지
			System.out.println(dp[N][0] + " " + dp[N][1]);
		}
	}
}
