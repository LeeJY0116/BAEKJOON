package Silver;

import java.util.Scanner;

public class Baekjoon1244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int switches = sc.nextInt();
		int[] status = new int[switches];
		for(int i = 0; i < switches; i++) {
			status[i] = sc.nextInt();
		}
		int students = sc.nextInt();
		
		for(int i = 0; i < students; i++) {
			int sex = sc.nextInt();
			int num = sc.nextInt();
			if(sex == 1) {
				for(int j = 1; j <= switches / num; j++) {
					int idx = j * num - 1;
					status[idx] = status[idx] == 0 ? 1 : 0;
				}
			}
			else if(sex == 2) {
				int left = num - 2;
				int right = num;
				
				while(left >= 0 && right < switches && status[left] == status[right]) {
					left--;
					right++;
				}
				for(int j = left + 1; j <= right-1; j++) {
					status[j] = status[j] == 0 ? 1 : 0;
				}
			}
		}
		for(int i = 0; i < switches; i++) {
			System.out.print(status[i] + " ");
			if(i != 0 && i % 19 == 0) {
				System.out.println();
			}
		}
	}
}
