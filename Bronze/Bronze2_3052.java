package Bronze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bronze2_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer> list = new HashMap<>();
		int a = 0;
		for(int i=0; i < 10; i++) {
			a = sc.nextInt()%42;
			list.put(a, list.getOrDefault(a,0) +1); // 서로 다른 나머지 값을 카운팅
		}
		System.out.println(list.size());
	}
}
