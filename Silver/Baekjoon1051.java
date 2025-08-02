package Silver;

import java.util.Scanner;

public class Baekjoon1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int maxLen = 1;
		sc.nextLine();
		char[][] map = new char[N][M];
		for(int i = 0; i < N; i++) {
			String line = sc.nextLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = line.charAt(j);
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= M; j++) {
				for(int len = 1; i + len < N && j + len < M; len++) {
					if(map[i][j] == map[i][j+ len] &&
					   map[i][j] == map[i+ len][j] && 
					   map[i][j] == map[i+ len][j+ len]) {
						maxLen = Math.max(maxLen, len + 1); 
					}
				}
			}
		}

		System.out.println(maxLen * maxLen);
		
	}

}
