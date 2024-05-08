package Algorithm.Backjoon.ch07_2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int [][] ary;
        ary = new int[9][9];

        int max = 0;
        int resultRow = 0;
        int resultColumn = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                ary[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < ary[i][j]) {
                    max = ary[i][j];
                    resultRow = i;
                    resultColumn = j;
                }
            }
        }

        System.out.println(max + "\n" + (resultRow + 1) + " " + (resultColumn + 1));
    }
}
