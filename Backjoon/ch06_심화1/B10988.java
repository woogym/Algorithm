package Algorithm.Backjoon.ch06_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String strReverse = sb.append(str).reverse().toString();

        if (str.equals(strReverse)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
