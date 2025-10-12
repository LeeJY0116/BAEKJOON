package Silver;

import java.io.*;
import java.util.*;

public class Baekjoon15649 {
    static int N, M;
    static boolean[] visited;
    static int[] path;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        path = new int[M];

        dfs(0);

        System.out.print(sb.toString());
    }

    // depth: 지금까지 뽑은 수의 개수(0..M)
    static void dfs(int depth) {
        // M개를 다 뽑았으면 출력
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(path[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 1..N을 돌며 아직 쓰지 않은 숫자를 선택
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;     // 사용 표시
                path[depth] = i;       // 현재 깊이에 배치

                dfs(depth + 1);        // 다음 깊이로

                visited[i] = false;    // 되돌리기
                path[depth] = -1;      //  디버깅용
            }
        }
    }
}