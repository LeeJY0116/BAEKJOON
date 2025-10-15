package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11659 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] num = new int[N+1];
		for(int i = 1; i <= N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		// 누적합 계산
		int[] sum = new int[N+1];
		sum[0] = 0;
		for(int i = 1; i <= N; i++) {
			sum[i] = sum[i-1] + num[i];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(sum[b] - sum[a-1]).append('\n');
		}
		System.out.println(sb);
	}

}
