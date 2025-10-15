package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon1966 {
	
	// 큐의 값과 인덱스를 같이 저장하기 위해 클래스 선언
	static class Doc{
		int priority;
		int idx;
		Doc(int p, int i) {priority = p; idx = i;}
	}
	
	public static void main(String[] args) throws IOException{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		// T가 0이 될 때까지 반복
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			// 내림차순 우선순위 큐와 순서와 값이 저장 될 일반 큐 생성
			Queue<Doc> q = new ArrayDeque<>();
			PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
			
			// 큐에 값 입력
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				int p = Integer.parseInt(st.nextToken());
				q.offer(new Doc(p, i));
				pq.offer(p);
			}
			
			int count = 0;
			
			// break문에 걸릴 때까지 무한반복
			while(true) {
				Doc cur = q.poll();
				
				// 현재 큐의 값의 우선순위가 최대값일 때 출력 및 카운트 증가
				if(pq.peek() == cur.priority) {
					pq.poll();
					count++;	
					// 현재 큐의 값의 우선순위가 최대이면서 인덱스 값이 M과 같을 때 종료
					if(cur.idx == M) {
					sb.append(count).append('\n');
					break;	
					}
				}
				else {	// 회전
					q.offer(cur);
				}
			}
		}
		System.out.println(sb);
		
		

	}

}
