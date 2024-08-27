package Algorithm.Programers.코딩테스트_입문.part_61to80;

import java.util.Arrays;

public class Programmers_68 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] strAry = s.split("");
            char[] ch;

            for (int i = 0; i < strAry.length; i++) {
                if (!s.contains(strAry[i])) {
                    answer += strAry[i];
                }
            }

            ch = answer.toCharArray();
            Arrays.sort(ch);

            return String.valueOf(ch);
        }
    }
}
