package Bronze;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bronze1_1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 진짜 약수의 개수
		sc.close();
		List<Integer> A = new ArrayList<>();	// N의 진짜 약수
		for(int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		
		A.sort(Comparator.naturalOrder());	// 오름차순으로 정렬
		System.out.println(A.get(0)*A.get(A.size()-1));	// 약수중 가장 작은 숫자와 가장 큰 숫자를 곱해서 추출
	}
}
