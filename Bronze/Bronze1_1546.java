package Bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bronze1_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> score = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			score.add(sc.nextInt());
		}
		double M = Collections.max(score);
		double sum = score.stream().mapToInt(Integer::intValue).sum();
		double newScore = sum/M*100;
		System.out.println(newScore/N);

	}

}
