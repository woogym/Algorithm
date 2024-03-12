package Algorithm.Backjoon.ch04_1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2562 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] ary = new int[9];
        int max = 0;
        int location = 0;

        for (int i = 0; i < ary.length; i++) {
            st = new StringTokenizer(br.readLine(), "\n");
            ary[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < ary.length; i++) {
            if (ary[i] > max) {
                max = ary[i];
                location = i + 1;
            }
        }

        System.out.println(max + "\n" + location);
    }
}
