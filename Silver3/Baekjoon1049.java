package Silver3;

import java.util.Scanner;

public class Baekjoon1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int price = 0;
		int M = sc.nextInt();
		int minPack = Integer.MAX_VALUE;
		int minUnit = Integer.MAX_VALUE;
		int[][] brand = new int[M][2];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < 2; j++) {
				brand[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < M; i++) {
			if(brand[i][0] < minPack) {
				minPack = brand[i][0];
			}
			if(brand[i][1] < minUnit) {
				minUnit = brand[i][1];
			}
		}
		int cost1 = ((N / 6) + 1) * minPack;					// 전부 패키지로 구매
		int cost2 = N * minUnit;								// 전부 낱개로 구매
		int cost3 = ((N / 6) * minPack) + ((N % 6) * minUnit);	// 패키지 + 낱개로 구매
		price = Math.min(Math.min(cost1, cost2), cost3);		// 가장 싼 가격 반환
		System.out.println(price);
	}
}
