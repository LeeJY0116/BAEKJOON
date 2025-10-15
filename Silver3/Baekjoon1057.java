package Silver3;

import java.util.Scanner;

public class Baekjoon1057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Kim = sc.nextInt();
		int Lim = sc.nextInt();
		int round = 0;
		
		while(Kim != Lim) {
			Kim = (Kim+1)/2;
			Lim = (Lim+1)/2;
			round++;
		}
		System.out.println(round);
	}
}
