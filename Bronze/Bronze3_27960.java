package Bronze;

import java.util.Scanner;

public class Bronze3_27960 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		
		int c = a ^ b;
		System.out.println(c);
	}
}
