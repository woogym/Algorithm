package Algorithm.Backjoon.ch01_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(a * b);
    }
}
