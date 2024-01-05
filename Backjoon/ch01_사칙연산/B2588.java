package Algorithm.Backjoon.ch01_사칙연산;
import java.io.*;
public class B2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println(a * (b%10));
        System.out.println(a * ((b%100)/10));
        System.out.println(a * (b/100));
        System.out.println(a * b);
    }
}

//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//학창시절 곱셈 식을 풀어쓸때 그 과정을 출력하는 문제임
//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.