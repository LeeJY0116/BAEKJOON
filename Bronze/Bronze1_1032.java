package Bronze;

import java.util.Scanner;

public class Bronze1_1032 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] files = new String[N];
		for(int i=0; i<N; i++) {
			files[i] = sc.nextLine();
		}
		StringBuilder pattern = new StringBuilder(files[0]);
		
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < files[i].length(); j++) {
				if(pattern.charAt(j) != files[i].charAt(j)) {
					pattern.setCharAt(j, '?');
				}
			}
		}
		System.out.println(pattern.toString());
	}
}
