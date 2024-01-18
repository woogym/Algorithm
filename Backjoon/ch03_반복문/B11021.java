package Algorithm.Backjoon.ch03_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int[] a = new int[num + 1];
        int[] b = new int[num + 1];

        for (int i=1; i<=num; i++) {
            st = new StringTokenizer(br.readLine());

            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= num; i++) {
            System.out.println("Case #" + i + ": " + (a[i] + b[i]));
        }
    }
}
