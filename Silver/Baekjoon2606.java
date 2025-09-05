package Silver;

import java.util.*;

public class Baekjoon2606 {
    static List<Integer>[] graph; // 인접 리스트
    static boolean[] visited;     // 방문 여부 체크
    static int infected = 0;      // 감염된 컴퓨터 수(1번 제외)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // 컴퓨터 수 (정점 수)
        int m = sc.nextInt();      // 연결 쌍 수 (간선 수)

        // 인접 리스트 초기화 (1-indexed 사용)
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        // 간선 입력 (양방향)
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[n + 1];

        // 1번 컴퓨터에서 시작하여 DFS 탐색
        visited[1] = true;
        dfs(1);

        // 1번 제외한 감염 수 출력
        System.out.println(infected);
        //bfs();
    }

    // 깊이 우선 탐색: 1에서 도달 가능한 정점 수를 센다
    static void dfs(int cur) {
        for (int next : graph[cur]) {
            if (!visited[next]) {
                visited[next] = true;
                infected++;   // 새로 방문(감염)한 컴퓨터 카운트
                dfs(next);
            }
        }
    }
    
    // 너비 우선 탐색
    static void bfs() {
    	Queue<Integer> q = new ArrayDeque<>();
    	q.add(1);
    	int cnt = 0;
    	while(!q.isEmpty()) {
    		int cur = q.poll();
    		for(int next : graph[cur]) {
    			if(!visited[next]) {
    				visited[next] = true;
    				cnt++;
    				q.add(next);
    			}
    		}
    	}
    	System.out.println(cnt);
    }
}

