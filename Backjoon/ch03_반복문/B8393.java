package Algorithm.Backjoon.ch03_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = a; i >= 0; i--) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
