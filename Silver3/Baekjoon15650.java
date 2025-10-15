package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon15650 {
	static int N, M;
	static StringBuilder sb = new StringBuilder();
	static int[] path;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		path = new int[M];
		dfs(0,1);
		System.out.println(sb);
	}
    // depth : 지금까지 뽑은 수의 개수(0..M) start : 시작지점
	static void dfs(int depth, int start) {
		
        // M개를 다 뽑았으면 출력
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(path[i]).append(" ");
			}
			sb.append('\n');
			return;
		}
		
        // 1..N을 돌며 아직 쓰지 않은 숫자를 선택
		for(int i = start; i <= N; i++) {
			//가지치기 (선택사항)
			int remain = N - i + 1;		// i..N 남은 개수
			int need = M - depth;		// 앞으로 더 뽑아야 할 개수
			if(remain < need) break;	// 더 진행 불가 -> 종료
			
			path[depth] = i;
			dfs(depth + 1, i + 1);
		}
	}
}
