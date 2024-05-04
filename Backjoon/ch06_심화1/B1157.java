package Algorithm.Backjoon.ch06_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {

            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                alphabet[str.charAt(i) - 'A']++; // 대문자 번위에서 판별후 해당 인덱스 값 1증가
            } else {
                alphabet[str.charAt(i) - 'a']++; // 소문자 범위에서 판별후 해당 인덱스 값 1증가
            }
        }

        char ch = '?';
        int max = -1;

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 65);
            } else if (max == alphabet[i]) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}
