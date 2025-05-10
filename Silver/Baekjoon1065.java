package Silver;

import java.util.Scanner;

public class Baekjoon1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(hanNumber(sc.nextInt()));
		
	}
	
	public static int hanNumber(int num) {
		int cnt = 0;
		
		if(num < 100) {
			return num;
		}
		else {
			cnt = 99;
			
			for(int i = 100; i < num+1; i++) {
				int hundred = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hundred - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
