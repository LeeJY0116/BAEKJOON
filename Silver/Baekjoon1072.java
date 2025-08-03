package Silver;

import java.util.Scanner;

public class Baekjoon1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextInt();
		long Y = sc.nextInt();
		long Z = (Y * 100) / X;

		if(Z >= 99) {
			System.out.println(-1);
			return;
		}
		
		long left = 1;
		long right = X;
		long result = -1;
		while(left <= right) {
			long mid = (left + right) /2;
			long newZ = ((Y + mid) * 100) / (X + mid);
			
			if(newZ > Z) {
				result = mid;
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
			System.out.println("left = " + left + " right = " + right + " newZ = " + newZ +  " mid = " + mid);
		}
//		System.out.println(Z);
		System.out.println(result);
	}
}
