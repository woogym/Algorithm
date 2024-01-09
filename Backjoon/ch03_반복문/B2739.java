package Algorithm.Backjoon.ch03_반복문;

import java.util.Scanner;

public class B2739 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i = 1; i <10; i ++) {
            System.out.println(num + " * " +  i + " = " + (num * i));
        }
    }
}
