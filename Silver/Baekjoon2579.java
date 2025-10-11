package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2579 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		int[] score = new int[N + 1];	// 1-indexed
		
		for(int i = 1; i <= N; i++) {
			score[i] = Integer.parseInt(br.readLine().trim());
		}
		
		
        // 예외/베이스 처리: N이 작을 때는 직접 반환
		if ( N == 1 ) {
			System.out.println(score[1]);
			return;
		}
		if ( N == 2 ) {
			System.out.println(score[1] + score[2]);
			return;
		}
		
		
        // dp[i] = i번 계단을 '밟고' 도달했을 때의 최대 점수
		int[] dp = new int[N + 1];
		
		
        // 베이스 케이스
		dp[1] = score[1];
		dp[2] = score[1] + score[2];
		
        // i=3일 때 두 경우 중 최댓값:
        // (1 -> 3) 또는 (2 -> 3)
		dp[3] = Math.max(score[1] + score[3], score[2] + score[3]);
		
		
        // 점화식
        // dp[i] = max(
        //    dp[i-2] + score[i],               // (i-2) -> i
        //    dp[i-3] + score[i-1] + score[i]   // (i-3) -> (i-1) -> i  (연속 3칸 방지)
        // )
		for(int i = 4; i <= N; i++) {
			dp[i] = Math.max(
					dp[i-2] + score[i], 
					dp[i-3] + score[i-1] + score[i]);
		}
		System.out.println(dp[N]);

	}

}
