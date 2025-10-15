package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon13305 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Long[] distance = new Long[N];
		for(int i = 0; i < N-1; i++) {
			distance[i] = Long.parseLong(st.nextToken());
		}
		Long[] price = new Long[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			price[i] = Long.parseLong(st.nextToken());
		}
		Long minprice = price[0];
		Long totalPrice = 0L;
		for(int i = 0; i < distance.length-1; i++) {
			minprice = Math.min(minprice, price[i]);
			totalPrice += minprice * distance[i];
		}
		sb.append(totalPrice);
		System.out.println(sb);
	}

}
