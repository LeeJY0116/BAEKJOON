package Silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] isPrime = new boolean[N+1];
		isPrime[0] = true;
		isPrime[1] = true;
		ArrayList<Integer> primeList = new ArrayList<>();
		for(int i = 2; i * i <= N; i++) {
			if(!isPrime[i]) {
				for(int j = i * i; j <= N; j += i) {
					isPrime[j] = true;
				}
			}
		}
		for(int i = 0; i <= N; i++) {
			if(!isPrime[i]) primeList.add(i);
		}
		
		for(int i = 0; i <primeList.size(); i++) {
			if(primeList.get(i) >= M) System.out.println(primeList.get(i));
		}
	}
}
