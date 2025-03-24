package Bronze;

import java.util.Scanner;

public class Bronze1_1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		for(int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		
		int minLCM = Integer.MAX_VALUE;
		
		for(int i=0; i < 5; i++) {
			for(int j= i + 1; j < 5; j++){
				for(int k = j + 1; k < 5; k++) {
					int lcmValue = getLCM(getLCM(numbers[i], numbers[j]), numbers[k]);	// 5개 숫자 중 3개를 선택해서 최소 공배수를 찾는다.
					minLCM = Math.min(minLCM, lcmValue);
			}
		}
	}	
		System.out.println(minLCM);
	}
	
	public static int getLCM(int num1, int num2) {	// 유클리드 호제법을 이용하여 최소공배수를 구하는 함수
		return(num1 * num2) / getGCD(num1, num2);
	}
	
	public static int getGCD(int num1, int num2) {	// 유클리드 호제법을 이용하여 최소공약수를 구하는 함수
		while(num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
}
