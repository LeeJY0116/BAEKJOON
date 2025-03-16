package Bronze;

import java.util.Scanner;

public class Bronze4_2480 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int firstdice = s.nextInt();
		int seconddice = s.nextInt();
		int thirddice = s.nextInt();
		int prize = 0;
		
		if(firstdice == seconddice && seconddice == thirddice) {
			prize = 10000 +(firstdice * 1000);
		}
		else if(firstdice == seconddice || firstdice == thirddice) {
			prize = 1000 +(firstdice * 100);
		}
		else if(seconddice == thirddice) {
			prize = 1000 +(seconddice * 100);
		}
		else {
			prize = 100*(Math.max(firstdice,Math.max(seconddice, thirddice)));
		}
		System.out.println(prize);
	}
}
