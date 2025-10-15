package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1904 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1];
		
		// 예외 처리
		if(N == 1) {
			System.out.println(1);
			return;
		}
		
		// 베이스케이스 , 점화식 : f(n-1) + f(n-2)
		dp[1] = 1;
		dp[2] = 2;


		for(int i = 3; i <= N; i++){
			dp[i] = (dp[i-2] + dp[i-1]) % 15746;
		}
		System.out.println(dp[N]);
	}

}
