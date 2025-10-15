package Silver3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon1063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 킹의 초기 위치 입력
		String kingLoc = sc.next();
		int kingX = kingLoc.charAt(0) - 'A';	// 열 (문자 -> 숫자 변환)
		int kingY = kingLoc.charAt(1) - '1';	// 행 (문자 -> 숫자 변환)
		
		// 돌의 초기 위치 입력
		String rockLoc = sc.next();
		int rockX = rockLoc.charAt(0) - 'A';
		int rockY = rockLoc.charAt(1) - '1';
		
		
		int N = sc.nextInt();	// 이동 횟수
		
		// 이동 명령어에 따른 방향 설정
		Map<String, int[]> moves = new HashMap<>();
		moves.put("R", new int[]{1, 0});		// 오른쪽
		moves.put("L", new int[]{-1, 0});		// 왼쪽
		moves.put("B", new int[]{0, -1});		// 아래
		moves.put("T", new int[]{0, 1});		// 위
		moves.put("RT", new int[]{1, 1});		// 오른쪽 위
		moves.put("LT", new int[]{-1, 1});		// 왼쪽 위
		moves.put("RB", new int[]{1, -1});		// 오른쪽 아래
		moves.put("LB", new int[]{-1, -1});		// 왼쪽 아래
		
		for(int i = 0; i < N; i++) {
			String move = sc.next();
			int[] d = moves.get(move);
			
			int nextKingX = kingX + d[0];
			int nextKingY = kingY + d[1];
			
			// 킹이 체스판을 벗어나지 않는 경우에만 이동 시도
			if(isInside(nextKingX, nextKingY)) {
				// 킹이 이동하려는 위치에 돌이 있는 경우
				if(nextKingX == rockX && nextKingY == rockY){
					int nextRockX = rockX + d[0];
					int nextRockY = rockY + d[1];
					
					if(isInside(nextRockX, nextRockY)) {
						kingX = nextKingX;
						kingY = nextKingY;
						rockX = nextRockX;
						rockY = nextRockY;
					}
					// 돌이 벗어나면 아무것도 이동하지 않음
				}
				else {
					// 킹만 이동
					kingX = nextKingX;
					kingY = nextKingY;
				}
			}
		}
		String lastKingLoc = "" + (char)(kingX + 'A') + (char)(kingY + '1');
		String lastRockLoc = "" + (char)(rockX + 'A') + (char)(rockY + '1');
		System.out.println(lastKingLoc);
		System.out.println(lastRockLoc);

	}
	static boolean isInside(int x, int y) {
		return x >= 0 && x < 8 && y >= 0 && y < 8;
	}

}
