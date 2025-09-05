package Silver;

import java.util.Scanner;

public class Baekjoon1463 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // dp[i] = 정수 i를 1로 만드는 데 필요한 최소 연산 횟수
        int[] dp = new int[N + 1];

        // 기본값: dp[1] = 0

        for (int i = 2; i <= N; i++) {
            // 1) 먼저 -1 연산을 적용한 경우로 초기화
            dp[i] = dp[i - 1] + 1;

            // 2) 2로 나누어 떨어지면, /2 연산을 고려해 더 작은 값으로 갱신
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3) 3으로 나누어 떨어지면, /3 연산을 고려해 더 작은 값으로 갱신
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}