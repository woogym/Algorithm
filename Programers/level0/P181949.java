package Algorithm.Programers.level0;

import java.util.Scanner;

public class P181949 {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);

                if (Character.isUpperCase(ch)) {
                    sb.append(Character.toLowerCase(ch));
                } else {
                    sb.append(Character.toUpperCase(ch));
                }
            }

            System.out.println(sb);
        }
    }
}
