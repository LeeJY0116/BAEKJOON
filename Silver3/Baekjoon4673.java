package Silver3;

public class Baekjoon4673 {

	public static void main(String[] args) {
		int len = 10001;		// 10001 이상의 숫자는 필요 없으므로 범위 제한
		boolean[] check = new boolean[len];	// 셀프 넘버를 구분할 boolean 배열
		StringBuilder sb = new StringBuilder();
		

		for(int i = 1; i < len; i++) {
			int n = d(i);
			
			if(n < len) {
				check[n] = true;
			}
		}
		
		for(int i = 1; i < len; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {	// number + 10씩 나누며 1의자리 수를 더해서 각 자리수를 합함
			sum+= number % 10;
			number /= 10;
		}
		return sum;
	}
}
