package Algorithm.Backjoon.ch06_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int chess[] = {1 ,1, 2, 2, 2, 8};
        int donghyuk[] = new int[6];
        String result[] = br.readLine().split(" ");

        for (int i = 0; i < donghyuk.length; i++) {
            donghyuk[i] = Integer.parseInt(result[i]);
        }

        for (int i = 0; i < donghyuk.length; i++) {
            int answer = chess[i] - donghyuk[i];
            System.out.print(answer + " ");
        }
    }
}
