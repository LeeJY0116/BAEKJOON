package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2941 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		String str = br.readLine();
		int len = str.length();
		for(int i = 0; i < len; i++) {
			if(i == len-1) {			// 마지막 알파벳이 크로아티아 알파벳인 경우 예외처리
				count++;
				break;
			}
			char ch = str.charAt(i);
			if(ch == 'c') {
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {
					i++;
				}
			}
			if(ch == 'd') {
				if(str.charAt(i+1) == 'z') {
					if(i == len-2) {		// 예외처리
						count+=2;
						break;
					}
					else if(str.charAt(i+2) == '=') {
						i+=2;
					}
				}
				else if(str.charAt(i+1) == '-') {
					i++;
				}
			}
			if(ch == 'l') {
				if(str.charAt(i+1) == 'j') {
					i++;
				}
			}
			if(ch == 'n') {
				if(str.charAt(i+1) == 'j') {
					i++;
				}
			}
			if(ch == 's') {
				if(str.charAt(i+1) == '=') {
					i++;
				}
			}
			if(ch == 'z') {
				if(str.charAt(i+1) == '=') {
					i++;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}
