package Silver3;

import java.util.Scanner;

//백준 1244번: 스위치 켜고 끄기
//학생들이 스위치 상태를 토글함 (성별/숫자에 따라 다르게 작동)

public class Baekjoon1244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int switches = sc.nextInt(); 				// 스위치 개수
		int[] status = new int[switches]; 			// 각 스위치의 상태 저장 (0: 꺼짐, 1: 켜짐)
		for(int i = 0; i < switches; i++) {
		    status[i] = sc.nextInt();			    // 초기 스위치 상태 입력
		}
		
		int students = sc.nextInt();				// 학생 수
		
		for(int i = 0; i < students; i++) {
		    int sex = sc.nextInt(); 				// 성별 (1: 남자, 2: 여자)
		    int num = sc.nextInt(); 				// 학생이 받은 번호

		    if(sex == 1) { 							// 남학생: 받은 수의 배수 위치를 토글
		        for(int j = 1; j * num <= switches; j++) {
		            int idx = j * num - 1; 			// 0-based index
		            status[idx] = status[idx] == 0 ? 1 : 0; // 토글
		        }
		    } else { 								// 여학생: 중심 기준으로 좌우 대칭이 같으면 확장하며 토글
		        int left = num - 2;
		        int right = num;

		        // 좌우 대칭 범위 확장
		        while(left >= 0 && right < switches && status[left] == status[right]) {
		            left--;
		            right++;
		        }

		        // 대칭 범위 내 스위치 토글
		        for(int j = left + 1; j <= right - 1; j++) {
		            status[j] = status[j] == 0 ? 1 : 0;
		        }
		    }
		}

		// 출력: 20개씩 줄바꿈
		for(int i = 0; i < switches; i++) {
		    System.out.print(status[i] + " ");
		    if((i + 1) % 20 == 0) System.out.println();
		}
	}
}
