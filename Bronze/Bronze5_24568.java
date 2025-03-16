package Bronze;

import java.util.Scanner;

public class Bronze5_24568 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int regularBox = s.nextInt();
		int smallBox = s.nextInt();
		int students = 28;
		
		int result = 0;
		result = (regularBox * 8) + (smallBox * 3);
		System.out.println(result-students);
	}
}
