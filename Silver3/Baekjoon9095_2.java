package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9095_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] testCases = new int[T];
		int maxN = 0;
		
		for(int i = 0; i < T; i++) {
			testCases[i] = Integer.parseInt(br.readLine());
			maxN = Math.max(maxN, testCases[i]);
		}
		
		int[] dp = new int[maxN + 3];
		
		dp[0] = 1;
		if (maxN >= 1) dp[1] = 1;
		if (maxN >= 2) dp[2] = 2;
		if (maxN >= 3) dp[3] = 4;
		
		for(int i = 4; i <= maxN; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : testCases) {
			sb.append(dp[i]).append("\n");
		}
		System.out.println(sb);

	}

}
