package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon3273 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());
		
		Arrays.sort(num);
		int count = 0;
		
		// 투포인터 방식
		int left = 0;
		int right = n-1;

		
		while(left < right) {
			int sum = num[left] + num[right];
			
			if(sum == x) {
				count++;
				left++;
				right--;
			}
			else if(sum > x) {
				right--;
			}
			else {
				left++;
			}
		}
		
		System.out.println(count);
	}

}
