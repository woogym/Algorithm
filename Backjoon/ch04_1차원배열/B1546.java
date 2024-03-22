package Algorithm.Backjoon.ch04_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double[] ary = new double[Integer.parseInt(br.readLine())];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < ary.length; i++) {
            ary[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(ary);

        for (int i = 0; i < ary.length; i++) {
            sum += (ary[i] / ary[ary.length - 1] * 100);
        }

        System.out.println(sum / ary.length);
    }
}
