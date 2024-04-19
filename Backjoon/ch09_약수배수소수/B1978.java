package Algorithm.Backjoon.ch09_약수배수소수;

import java.util.Scanner;

public class B1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ss = 0;
        for (int k = 0; k < n; k++) {
            int num = scanner.nextInt();
            int error = 0;
            if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        error++;
                    }
                }
                if (error == 0) {
                    ss++;
                }
            }
        }
        System.out.println(ss);
    }
}