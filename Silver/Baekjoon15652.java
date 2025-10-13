package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon15652 {
	static int N, M;
	static int[] path;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		path = new int[M];
		dfs(0, 1);
		System.out.println(sb);

	}
	
	
//	예시 흐름 (N=3, M=2)
//
//	비내림차순(같거나 커야 함):
//
//	시작: depth=0, start=1 → i=1,2,3
//
//	i=1 → depth=1, start=1 → (1,1), (1,2), (1,3)
//
//	i=2 → depth=1, start=2 → (2,2), (2,3)
//
//	i=3 → depth=1, start=3 → (3,3)
//	→ 출력: 1 1, 1 2, 1 3, 2 2, 2 3, 3 3
	static void dfs(int depth, int start) {
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(path[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i = start; i <= N; i++) {
			path[depth] = i;
			dfs(depth + 1, i);
			
		}
	}

}
