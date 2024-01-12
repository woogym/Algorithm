package Algorithm.Backjoon.ch08_일반수학1;

import java.util.*;

public class B2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int b = sc.nextInt();

        long result = 0;
        int idx = 0;
        int num = 0;

        for(int i = str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            if(c>='0' && c<='9')
                num = c - '0';
            else
                num = c - 55;
            result += num * Math.pow(b, idx++);
        }
        System.out.println(result);
    }
}

