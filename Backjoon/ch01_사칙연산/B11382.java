package Algorithm.Backjoon.ch01_사칙연산;
import java.io.*;
import java.util.*;
public class B11382 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());
        long num3 = Long.parseLong(st.nextToken());

        System.out.println(num1 + num2 + num3);
    }
}
// (1 ≤ A, B, C ≤ 10^12)의 범위의 숫자를 입력받아
// 3가지의 수를 더하는 간단한 문제