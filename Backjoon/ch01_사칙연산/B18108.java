package Algorithm.Backjoon.ch01_사칙연산;
import java.io.*;
public class B18108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 544;

        System.out.println(a - b + 1);
    }
}