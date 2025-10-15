package Silver3;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon9095 {

	
    // dp[n] = n을 1,2,3의 합으로 만드는 방법 수
    // -1: 아직 계산 전
	static int[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] testCases = new int[T];
		int maxN = 0;
		
		// 1) 테스트 케이스 입력 및 최대 n 찾기
		for (int i = 0; i < T; i++) {
			testCases[i] = sc.nextInt();
			maxN = Math.max(maxN, testCases[i]);
		}
		// 2) 메모 배열 준비(0 ~ maxN)
		dp = new int[maxN + 1];
		Arrays.fill(dp, -1);
		
        // 3) 베이스 케이스
        // f(0) = 1 : 빈 수열 1가지 (점화식의 시작점)
		if(maxN >= 0) dp[0] = 1;
		if(maxN >= 1) dp[1] = 1;	// f(1) = 1 : (1)
		if(maxN >= 2) dp[2] = 2;	// f(2) = 2 : (1 + 1, 2)
		if(maxN >= 3) dp[3] = 4;	// f(3) = 4 : (1 + 1 + 1, 1 + 2, 2 + 1, 3)

		
		// 4) 각 테스트케이스 정답 출력
		StringBuilder sb = new StringBuilder();
		for(int i : testCases) {
			sb.append(summary(i)).append("\n");
		}
		System.out.println(sb);
	}
	
    // Top-Down: 재귀 + 메모이제이션
    // 점화식: f(n) = f(n-1) + f(n-2) + f(n-3)
	static int summary(int n) {
		
		// 음수로 내려가면 만들 수 있는 경우 없음 → 0
		if(n < 0) return 0;
		
		// 이미 계산된 값이면 그대로 반환
		if(dp[n] != -1) return dp[n];
		
		// 아직이면 재귀적으로 계산하면서 메모
		dp[n] = summary(n-1) + summary(n-2) + summary(n-3);
		return dp[n];
	}

}
