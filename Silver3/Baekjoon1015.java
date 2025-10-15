package Silver3;

import java.util.Scanner;

public class Baekjoon1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] P = new int[n];
		
		// 배열 A의 값 입력, 출력할 수열을 0으로 초기화
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			P[i] = 0;
		}
		
		// 이중 for문으로 배열 값을 비교하며 수열값 증가 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(A[i] > A[j]) {
					P[i]++;
				}
				
				// 값이 같을 시 앞서 나온 값부터 출력 
				if(j > i && A[j] == A[i]) {
					P[j]++;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(P[i] + " ");
		}
	}
}
