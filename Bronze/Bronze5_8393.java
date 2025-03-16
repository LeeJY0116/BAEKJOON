package Bronze;

import java.util.Scanner;

public class Bronze5_8393 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int result = 0;
		for(int i = 1; i <= A; i++) {
			result += i;
		}
		System.out.println(result);
	}
}
