package Algorithm.Backjoon.ch03_반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num  = Integer.parseInt(br.readLine());
        int wow = num / 4;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < wow; i++) {
            result.append("long ");
        }

        System.out.println(result + "int");
    }
}
