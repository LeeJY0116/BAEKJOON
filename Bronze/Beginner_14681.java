package Bronze;

import java.util.Scanner;

public class Beginner_14681 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long x = s.nextLong();
		long y = s.nextLong();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3");
		}
		else {
			System.out.println("4");
		}
	}

}
