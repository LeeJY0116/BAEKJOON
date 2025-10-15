package Silver3;

import java.util.Scanner;

public class Baekjoon1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 현재까지의 총 게임 수(X), 이긴 게임 수(Y)
		long X = sc.nextInt();
		long Y = sc.nextInt();
		
		// 현재 승률 (정수형 비율로 계산)
		long Z = (Y * 100) / X;

		 // 승률이 99 이상이면 더 이상 변하지 않음 → -1 출력
		if(Z >= 99) {
			System.out.println(-1);
			return;
		}
		
		// 이분 탐색 범위 설정
		long left = 1;
		long right = X;
		long result = -1;
		
		// 이분 탐색 시작
		while(left <= right) {
			long mid = (left + right) /2;
			
			// mid번 게임을 더 했을 때 승률 계산
			long newZ = ((Y + mid) * 100) / (X + mid);
			
			// 승률이 증가하면 정답 후보 저장하고 더 작은 수 탐색
			if(newZ > Z) {
				result = mid;
				right = mid - 1;
			}
			
			// 승률이 그대로거나 증가하지 않으면 더 큰 수 탐색
			else {
				left = mid + 1;
			}
		}
		
		// 정답 출력
		System.out.println(result);
	}
}
