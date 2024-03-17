package Algorithm.Backjoon.ch04_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] ary = new int[31];

        for (int i = 1; i < 29; i++) {
            st = new StringTokenizer(br.readLine(), "\n");

            int num = Integer.parseInt(st.nextToken());

            ary[num] = 1;
        }

        for (int j = 1; j < ary.length; j++) {
            if (ary[j] != 1) {
                System.out.println(j);
            }
        }
    }
}