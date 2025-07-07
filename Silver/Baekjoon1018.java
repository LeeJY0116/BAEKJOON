package Silver;

import java.util.Scanner;

public class Baekjoon1018 {
	static char[][] board;
	static int N, M;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		
		board = new char[N][M];
		for(int i = 0; i < N; i++) {
			String line = sc.nextLine();
			for(int j = 0; j < M; j++) {
				board[i][j] = line.charAt(j);
			}
		}
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i <= N - 8; i++) {
			for(int j = 0; j <= M - 8; j++) {
				int cnt = paint(i, j);
				if(cnt < min) {
					min = cnt;
				}
			}
		}
		System.out.println(min);
	}
	
	public static int paint(int row, int col) {
	    int count1 = 0; // 시작이 'W'
	    int count2 = 0; // 시작이 'B'

	    for (int i = 0; i < 8; i++) {
	        for (int j = 0; j < 8; j++) {
	            char expected1 = ((i + j) % 2 == 0) ? 'W' : 'B'; // 시작 W
	            char expected2 = ((i + j) % 2 == 0) ? 'B' : 'W'; // 시작 B

	            if (board[row + i][col + j] != expected1) count1++;
	            if (board[row + i][col + j] != expected2) count2++;
	        }
	    }
	    return Math.min(count1, count2);
	}
}
