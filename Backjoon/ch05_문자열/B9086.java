package Algorithm.Backjoon.ch05_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] strs = new String[num];

        for (int i = 0; i < num; i++) {
            strs[i] = br.readLine();
        }

        // strs 배열의 문자열이 비워질때까지 하나씩 result에 옮겨가면서 주어진 로직을 수행
        for (String result : strs) {
            System.out.println(result.charAt(0) + "" + result.charAt(result.length() - 1));
        }


//        int num = Integer.parseInt(br.readLine());
//        String str;
//        String count;
//        String[] result = new String[num];
//
//        for (int i = 0; i < num; i++) {
//            str = br.readLine();
//            count = "" + str.charAt(0) + str.charAt(str.length() - 1);
//            result[i] = count;
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
    }
}