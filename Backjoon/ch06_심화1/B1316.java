package Algorithm.Backjoon.ch06_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i); // 현재 문자 저장

            // 앞선 문자가 i번째 문자와 같지 않다면
            if (prev != now) {
                // 해당 문자가 처음 나오는 경우
                if (!check[now - 'a']) {
                    check[now - 'a'] = true; // true로 바꿔준다
                    prev = now; // 다음 턴을 위한 작업
                }

                // 해당 문자가 이미 나온 적이 있는 경우
                else {
                    return false; // 함수 종료
                }
            }

            // else문은 필요없음
            else {
                continue;
            }
        }

        return true;
    }
}
