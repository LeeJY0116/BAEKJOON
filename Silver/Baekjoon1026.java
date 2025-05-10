package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int sum = 0;
		Integer[] B_indices = new Integer[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		for(int i = 0; i < N; i++) B[i] = sc.nextInt();
		for(int i = 0; i < N; i++) B_indices[i] = i;
		
		Arrays.sort(A);
		
		Arrays.sort(B_indices, (i,j) -> Integer.compare(B[j], B[i]));
		for(int i = 0; i < N; i++) {
			sum += A[i] * B[B_indices[i]]; 
		}
		System.out.println(sum);
	}
}
