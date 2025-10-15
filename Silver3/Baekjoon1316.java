package Silver3;


import java.util.Scanner;

//문제
//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면,
//ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
//kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
//둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.


public class Baekjoon1316 {
	static boolean check(String str) {
		boolean[] check = new boolean[26];	// 알파벳 개수만큼 boolean 배열 선언
		int prev = 0;						// 이전 문자와 중복되는지 확인하기 위한 변수
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);		// 매개변수로 받은 str 변수를 int형으로 변환하여 prev와 비교
			
			if(prev != now) {
				if(check[now - 'a'] == false) {	// 처음 나온 문자인지 확인
				check[now - 'a'] = true;		// 처음 나온 문자라면 중복처리
				prev = now;
				}
				else {							// prev != now면서 check값이 true라면 그룹 단어가 아니므로 false 반환
					return false;
				}
			}
		}
		return true;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int word = sc.nextInt();
		for(int i = 0; i < word; i++) {
			String str = sc.next();
			if(check(str) == true)
				count ++;
		}
		System.out.println(count);
	}
}
