package Bronze;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bronze1_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> list = new HashMap<>();
		String a = sc.nextLine().toUpperCase();	// 대문자로 변환
		sc.close();
		
		for(char c : a.toCharArray()) {
			list.put(c, list.getOrDefault(c, 0) +1); // 문자 개수 카운트
		}
		
		int maxFreq = Collections.max(list.values());	// 최빈값의 value
		char mostFrequentChar = '?';	// 최빈값의 key
		int count = 0;	// 최빈값이 2개 이상일 경우를 체크하기 위한 변수
		
		for (Map.Entry<Character, Integer> entry : list.entrySet()) {
			if(entry.getValue() == maxFreq) {	// list중 value(빈도수)가 같은게 있다면 실행
				count++;
				mostFrequentChar = entry.getKey();	// 최빈값의 key를 저장함
			}
		}
		System.out.println(count > 1 ? "?" : mostFrequentChar);	// count가 1 이하라면 최빈값의 key, 2 이상이라면 ? 출력
	}
}
