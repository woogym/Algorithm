package Algorithm.Backjoon.ch03_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        br.close();

        // num에 입력된 정수만큼의 라인이 필요하니 정수 만큼의 라인을 만들 반복문을 설계
        // 알고리즘을 처음에 잘 설계할 수 있도록 사고할 것
        for (int a = 1; a <= num; a++) {
            for (int b = 1; b <= num - a; b++) {
                bw.write(" ");
            }
            for (int c = a; c > 0; c--){
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
