package Algorithm.Backjoon.ch05_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String num1 = st.nextToken();
        String num2 = st.nextToken();

        int reverseNum1 = Integer.parseInt(new StringBuilder(num1).reverse().toString());
        int reverseNum2 = Integer.parseInt(new StringBuilder(num2).reverse().toString());

        System.out.println(Math.max(reverseNum1, reverseNum2));
    }
}
