package Algorithm.Programers.코딩테스트_입문.part_61to80;

import java.util.Arrays;

// A로 B만들기
public class Programmers_66 {
    class Solution {
        public int solution(String before, String after) {
            int answer = 0;
            char[] beforeChar = before.toCharArray();
            char[] afterChar = after.toCharArray();

            Arrays.sort(beforeChar);
            Arrays.sort(afterChar);

            String str1 = new String(beforeChar);
            String str2 = new String(afterChar);

            if (str1.equals(str2)) {
                answer = 1;
            }

            return answer;
        }

        public int solution1(String before, String after) {
            char[] a = before.toCharArray();
            char[] b = after.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            return new String(a).equals(new String(b)) ? 1:0;
        }
    }
}
