package Algorithm.Backjoon.ch05_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // char형태의 ch는 br.readLine으로 읽은 문자 or 숫자의 charAt(0)을 통해서
        // ch의 가장 앞글자의 아스키코드 번호를 반환하게 된다
        char ch = br.readLine().charAt(0);

        // 아스키코드 ch의 값은 char형으로 int(정수형)으로 변환해서 반환한다
        int num = (int)ch;

        System.out.println(num);
    }
}