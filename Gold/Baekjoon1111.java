package Gold;

import java.util.Scanner;

public class Baekjoon1111 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수열의 길이 입력
        int[] arr = new int[n]; // 수열 배열

        // 수열 값 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // n == 1인 경우
        if (n == 1) {
            System.out.println("A");
            return;
        }

        // n == 2인 경우
        if (n == 2) {
            if (arr[0] == arr[1]) {
                System.out.println(arr[0]);
            } else {
                System.out.println("A");
            }
            return;
        }

        // n >= 3인 경우
        if (n >= 3) {
            int x1 = arr[0], x2 = arr[1], x3 = arr[2];
            int a = 0, b = 0;

            // 기울기 a 계산 시 분모가 0인지 체크
            if (x2 - x1 != 0) {
                a = (x3 - x2) / (x2 - x1);
                b = x2 - a * x1;
            } else {
                System.out.println("B");
                return;
            }

            boolean isTrue = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] != arr[i] * a + b) {
                    isTrue = false;
                    break;
                }
            }

            if (!isTrue) {
                System.out.println("B");
            } else {
                System.out.println(arr[n - 1] * a + b);
            }
        }
    }
}
