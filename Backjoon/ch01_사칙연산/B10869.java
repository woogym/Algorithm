package Algorithm.Backjoon.ch01_사칙연산;
import java.io.*;
import java.util.*;
// 숫자 2개를 입력받아 사칙연산을 하는 문제
// 난이도 높지 않아서 버퍼와 StringTokenizer를 사용했다
public class B10869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }
}
