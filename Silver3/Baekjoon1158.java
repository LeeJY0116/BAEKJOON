package Silver3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1158 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			list.add(i);
			}
		
		List<Integer> result = new ArrayList<>();
		int index = 0;
		
		while(!list.isEmpty()) {
			index = (index + K - 1)% list.size();
			result.add(list.remove(index));			// list에서 제거하면서 result에 추가
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for(int i = 0; i < result.size(); i++) {
			sb.append(result.get(i));
			if(i != result.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
}
