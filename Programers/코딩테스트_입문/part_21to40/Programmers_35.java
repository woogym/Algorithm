package Algorithm.Programers.코딩테스트_입문.part_21to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 직각삼각형 출력하기
public class Programmers_35 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // repeat를 이용해서 하나의 반복문으로 해결가능
        for (int i = 1; i <= num; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
