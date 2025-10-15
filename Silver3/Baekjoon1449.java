// 물을 막을 때 좌우 0.5만큼의 간격 
// 테이프는 자를 수 없지만 붙일 수는 있음

// 문제에선 구멍이 정수 좌표이지만, 테이프는 길이 L짜리 연속 구간을 덮는다.
//
// 구멍 하나를 덮으려면 그 구멍의 왼쪽 0.5와 오른쪽 0.5를 포함해야 하므로
// 구멍 x를 덮는 최소 구간은 [x - 0.5, x + 0.5]가 된다.
// 
// 비교 시 x + 0.5(오른쪽 경계)와 covered를 비교

package Silver3;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1449 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 물이 새는 곳의 개수
		int L = sc.nextInt();	// 테이프의 길이
		
		int[] hole = new int[N];
		for(int i = 0; i < N; i++) {
			hole[i] = sc.nextInt();
		}
		
		Arrays.sort(hole);	// 오름차순 정렬
		
		int tapes = 0;
		double covered = 0.0;
		// 현재 붙인 마지막 테이프가 덮는 "오른쪽 끝" 좌표 (실수로 관리)
		
		for(int x : hole) {
			// 이 지점이 이미 덮였는지 확인: 지점의 오른쪽 경계 x+0.5가 covered 이하라면 덮임
			if(x + 0.5 <= covered) continue;
			
			// 새 테이프를 붙여야 함: 왼쪽 끝을 x-0.5로 두면 가장 많은 오른쪽을 덮을 수 있음
			tapes++;
			covered = (x - 0.5) + L; // 이번 테이프가 덮는 구간의 오른쪽 끝
		}
		System.out.println(tapes);
	}
}
