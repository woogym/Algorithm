package Algorithm.Backjoon.ch04_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = Integer.parseInt(st.nextToken());
        int[] ary = new int[count];

        // 비교수
        int core = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < ary.length; i++) {
            ary[i] = Integer.parseInt(st2.nextToken());
        }

        int[] result = new int[count];
        int j = 0;

        for (int i = 0; i < ary.length; i++) {
            if (ary[i] < core) {
                result[j] = ary[i];
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
