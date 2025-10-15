//	팰린드롬 조건
//
//	문자열 길이가 짝수일 때: 모든 문자의 개수가 짝수여야 한다.
//
//	문자열 길이가 홀수일 때: 하나의 문자만 홀수 개수를 가질 수 있고, 나머지는 모두 짝수여야 한다.
//
//	알파벳 개수 세기
//
//	A~Z까지 등장 횟수를 센다.
//
//	홀수 개수 체크
//
//	홀수 개수를 가진 문자가 조건에 맞지 않으면 "I'm Sorry Hansoo" 출력.
//
//	사전순 정렬
//
//	알파벳 순서대로 절반을 왼쪽에 배치한다.
//
//	홀수 개수가 있으면 가운데 문자로 넣는다.
//
//	왼쪽 + 가운데 + 왼쪽을 뒤집은 것 = 최종 팰린드롬.
package Silver3;

import java.util.*;
public class Baekjoon1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // 입력 문자열 (A~Z 대문자)

        int[] count = new int[26]; // 알파벳 개수를 저장할 배열 (A~Z)

        // 입력 문자열의 각 문자의 등장 횟수를 센다
        for(char c : s.toCharArray()) {
            count[c - 'A']++; // 'A' → index 0, 'B' → index 1 ...
        }

        int oddCount = 0; // 홀수 개수를 가진 알파벳의 개수
        char mid = 0;     // 문자열 길이가 홀수일 때 가운데 들어갈 문자
        StringBuilder half = new StringBuilder(); // 왼쪽 절반 문자열

        // 알파벳 순서대로 확인
        for(int i = 0; i < 26; i++) {
            if(count[i] % 2 == 1) { // 만약 홀수 개수라면
                oddCount++; // 홀수 알파벳 개수 증가
                mid = (char)(i + 'A'); // 가운데 들어갈 문자 저장
            }
            // 절반만큼(짝수 개수의 절반) 왼쪽 문자열에 추가
            for(int j = 0; j < count[i] / 2; j++) {
                half.append((char)(i + 'A'));
            }
        }

        // 홀수 개수가 2개 이상이면 팰린드롬 불가능
        if(oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        // 왼쪽 절반 문자열
        String left = half.toString();
        // 오른쪽 절반은 왼쪽 절반을 뒤집은 것
        String right = half.reverse().toString();

        // 홀수 개수가 있으면 가운데 문자를 넣고 출력
        if(oddCount == 1) {
            System.out.println(left + mid + right);
        }
        // 아니면 (짝수 문자열) 왼쪽 + 오른쪽만 출력
        else {
            System.out.println(left + right);
        }
    }
}

