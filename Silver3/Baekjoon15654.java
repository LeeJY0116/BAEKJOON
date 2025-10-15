package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon15654 {
	static int N, M;
	static int[] nums;	// 입력 수들 (정렬 必)
	static int[] path;	// 현재까지 선택한 수열
	static boolean[] visited;	// 인덱스 기반 방문체크 (0..N-1)
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		nums = new int[N];
		visited = new boolean[N];
		path = new int[M];
		
		// 두 번째 줄: N개의 수
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		dfs(0);
		
		System.out.println(sb);
	}
	
	// depth: 지금까지 채운 길이(0..M)
	static void dfs(int depth) {
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(path[i]).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;		// 방문표시
				path[depth] = nums[i];	// 배치
				dfs(depth + 1);			// 다음 자리로
				visited[i] = false;		// 되돌리기
			}
		}
	}
}
