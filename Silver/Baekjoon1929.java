package Silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		boolean[] isPrime = new boolean[N+1];	// 소수를 판별할 boolean 변수집합
		
		// 0과 1은 소수가 아니다.
		isPrime[0] = true;
		isPrime[1] = true;
		ArrayList<Integer> primeList = new ArrayList<>();	// 소수를 저장할 리스트
		for(int i = 2; i * i <= N; i++) {
			
			// 에라토스테네스 체에 근거하여 현재 숫자가 소수라면 그 숫자의 배수는 소수가 아님
			if(!isPrime[i]) {
				for(int j = i * i; j <= N; j += i) {
					isPrime[j] = true;
				}
			}
		}
		
		// 소수를 primeList에 저장
		for(int i = 0; i <= N; i++) {
			if(!isPrime[i]) primeList.add(i);
		}
		
		// M과 N 사이에서 소수를 전부 출력
		for(int i = 0; i <primeList.size(); i++) {
			if(primeList.get(i) >= M) System.out.println(primeList.get(i));
		}
	}
}
