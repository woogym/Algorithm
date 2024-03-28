package Algorithm.Backjoon.ch05_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];

        // 알파벳에 기본 세팅으로 -1 넣어주기
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            // 문자열 하나씩 ch에 char형으로 저장
            char ch = str.charAt(i);

            if (alphabet[ch - 'a'] == -1) {
                alphabet[ch - 'a'] = i;
            }
        }

        for (int result : alphabet) {
            System.out.print(result + " ");
        }
    }
}
