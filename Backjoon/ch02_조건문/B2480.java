package Algorithm.Backjoon.ch02_조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        if (a != b && b != c && a != c) { // 3개의 눈이 다 다른 경우
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        } else if (a == b && a == c) { // 3개의 눈이 다 같은 경우
            System.out.println(10000 + (a * 1000));
        } else if (a == b || a == c) { // a가 b혹은 c랑 같은 경우
            System.out.println((a * 100) + 1000);
        } else { // b와 c가 같은 경우
            System.out.println((b * 100) + 1000);
        }
    }
}
