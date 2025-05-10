package Silver;

import java.util.Scanner;

public class Baekjoon1205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int score = sc.nextInt();
		int P = sc.nextInt();
		int rank = 1;
		int[] arr = new int[P];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			if(arr[i] > score) {
				rank++;
			}
			else {
				break;
			}
		}
		
		if(N == P && arr[N - 1] >= score) {
			rank = -1;
		}
		System.out.println(rank);
	}
}
