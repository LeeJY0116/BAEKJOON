// 시리얼번호 A와 B의 길이가 다르면 짧은 것이 먼저 온다.
// 서로 길이가 같다면 A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저 온다.(숫자만 더한다)
// 위 두 조건으로 비교할 수 없다면 사전순으로 비교한다. 숫자 < 알파벳

// 배열에 시리얼 번호를 담는다.
// 배열에 인덱스를 부여한다.
// 배열의 길이가 짧은 순으로 정렬한다.
// 자리수의 합으로 정렬한다.
// 사전순으로 정렬한다.


package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon1431 {
	
	// 문자열 내 숫자 합을 구하는 함수
	private static int digitSum(String s) {
		int sum = 0;
		for(char c : s.toCharArray()) {
			if(c >= '0' && c <= '9') sum += (c - '0');
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		String[] str = new String[N];
		for(int i = 0; i < N; i++) {
			str[i] = br.readLine().trim();
		}
		
		// 정렬: 길이 → 숫자합 → 사전순
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				
				// 1) 길이 비교
				if(a.length() != b.length()) return a.length() - b.length();
				
				// 2) 숫자합 비교
				int sumA = digitSum(a);
				int sumB = digitSum(b);
				if(sumA != sumB)return sumA - sumB;
				
				// 3) 사전순 비교 (기본 문자열 비교)
				return a.compareTo(b);
			}

		});
		
		StringBuilder sb = new StringBuilder();
		for(String s : str )sb.append(s).append('\n');
		System.out.print(sb);
	}

}
