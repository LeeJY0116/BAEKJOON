package Bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Bronze5_22193 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int M = s.nextInt();
		s.nextLine();
		String A = s.nextLine();
		String B = s.nextLine();
		
		BigInteger bigA = new BigInteger(A);
		BigInteger bigB = new BigInteger(B);
		BigInteger result = bigA.multiply(bigB);
		System.out.println(result);
	}
}
