package Algorithm.Backjoon.ch04_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // 바꿀 횟수
        int[] bocket = new int[n];
        int x;
        int y;

        for (int i = 0; i < bocket.length; i++) {
            bocket[i] = i + 1;
        }

        for (int a = 0; a < m; a++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st2.nextToken()) - 1;
            int j = Integer.parseInt(st2.nextToken()) - 1;
            x = bocket[i];
            y = bocket[j];
            bocket[i] = y;
            bocket[j] = x;
        }

        for (int i = 0; i < bocket.length; i++) {
            System.out.print(bocket[i] + " ");
        }
    }
}
