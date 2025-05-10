package Silver;

import java.util.Scanner;

public class Beakjoon1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int X = sc.nextInt();
		
//		1. 비트 연산으로 풀이
//		result = Integer.bitCount(X);
		

//		2. 나머지 연산으로 풀이
//		while(X > 0) {
//			if(X % 2 == 1) {
//				result++;
//			}
//			X /= 2;
//		}

//		3. 재귀 연산으로 풀이
		int stick = 64;
		while(X > 0) {
			if(X >= stick) {
				X -= stick;
				result ++;
			}
			stick /= 2;
		}
		System.out.println(result);
	}
}
