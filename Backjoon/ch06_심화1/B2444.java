package Algorithm.Backjoon.ch06_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input; i++) {

            for (int j = 0; j < input - i - 1; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        for (int i = input - 2; i >= 0; i--) {

            for (int j = 0; j < input - i - 1; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
