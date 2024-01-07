package Algorithm.Backjoon.ch01_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");
        double a = Integer.parseInt(input[0]);
        double b = Integer.parseInt(input[1]);

        double result = a / b;
        System.out.println(result);
    }
}
