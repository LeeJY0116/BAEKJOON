package Silver3;

import java.util.Scanner;

public class Baekjoon1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int maxLen = 1;		// 최소는 1x1 정사각형
		sc.nextLine();
		char[][] map = new char[N][M];
		for(int i = 0; i < N; i++) {
			String line = sc.nextLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = line.charAt(j);
			}
		}
		for(int i = 0; i < N; i++) {
			// 가능한 최대 정사각형 길이 구하기
			for(int j = 0; j <= M; j++) {
				for(int len = 1; i + len < N && j + len < M; len++) {
					// 꼭짓점 비교
					if(map[i][j] == map[i][j+ len] &&
					   map[i][j] == map[i+ len][j] && 
					   map[i][j] == map[i+ len][j+ len]) {
						maxLen = Math.max(maxLen, len + 1); 
					}
				}
			}
		}
		System.out.println(maxLen * maxLen);	// 넓이 출력
	}
}
