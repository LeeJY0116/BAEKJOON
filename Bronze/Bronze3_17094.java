package Bronze;

import java.util.Scanner;

public class Bronze3_17094 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		String chat = s.nextLine();
		s.close();
		
		int numCount = 0;
		int stringCount = 0;
		
		for(int i = 0; i < chat.length(); i++) {
			char c = chat.charAt(i);
			if(c == '2') {
				numCount++;
			}
			else if(c == 'e') {
				stringCount++;
			}
		}
		if(numCount > stringCount) {
			System.out.println("2");
		}
		else if(numCount < stringCount) {
			System.out.println("e");
		}
		else {
			System.out.println("yee");
		}
	}
}
