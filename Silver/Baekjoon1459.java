package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//문제
//세준이는 학교에서 집으로 가려고 한다. 도시의 크기는 무한대이고, 도시의 세로 도로는 모든 정수 x좌표마다 있고, 가로 도로는 모든 정수 y좌표마다 있다.
//세준이는 현재 (0, 0)에 있다. 그리고 (X, Y)에 위치한 집으로 가려고 한다. 
//세준이가 걸을 수 있는 방법은 두가지 인데, 하나는 도로를 따라서 가로나 세로로 한 블록 움직여서 이번 사거리에서 저 사거리로 움직이는 방법이고, 
//블록을 대각선으로 가로지르는 방법이 있다.
//세준이가 집으로 가는데 걸리는 최소시간을 구하는 프로그램을 작성하시오.


public class Baekjoon1459 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger X = new BigInteger(st.nextToken());
		BigInteger Y = new BigInteger(st.nextToken());
		BigInteger W = new BigInteger(st.nextToken());	// 직선 1칸 비용
		BigInteger S = new BigInteger(st.nextToken());	// 대각선 1칸 비용
		BigInteger min = X.min(Y);
		BigInteger max = X.max(Y);
		BigInteger time = BigInteger.ZERO;
		
		// 1) S <= W : 대각선이 가장 쌈 -> 가능한 한 전부 대각선 사용 + (홀수 남으면 직선 1번)
		if(S.compareTo(W) <= 0) {
            // (X+Y)가 짝수면 전부 대각선으로 도달 가능: max*S
            // (X+Y)가 홀수면 마지막 1칸은 직선 1번 필요: (max-1)*S + W
			boolean isEven = X.add(Y).mod(BigInteger.TWO).equals(BigInteger.ZERO);
			if(!isEven) {
				time = max.subtract(BigInteger.ONE).multiply(S).add(W);
			}
			else {
				time = max.multiply(S);
			}
		}
		else {
			// 2) W < S < 2W : 겹치는 부분은 대각선, 남는 차이는 직선
			if(S.compareTo(W.multiply(BigInteger.TWO)) <= 0) {
				time = min.multiply(S);
				X = X.subtract(min);
				Y = Y.subtract(min);
				max = X.max(Y);
				time = time.add(W.multiply(max));
			}
			// 3) S >= 2W : 대각선이 두 번 직선보다 비싸거나 같음 -> 전부 직선이 최적
			else { time = (X.add(Y)).multiply(W);
			}
		}
		System.out.println(time);
	}
}
