package Algorithm.Programers.코딩테스트_입문.part_61to80;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 한 번만 등장한 문자
public class Programmers_68 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] strAry = s.split("");
            int count = 0;

            for (int i = 0; i < strAry.length; i++) {
                String str = strAry[i];
                for (int j = 0; j < strAry.length; j++) {
                    if (str.equals(strAry[j])) {
                        count++;
                    }
                }

                if (count == 1) {
                    answer += str;
                }

                count = 0;
            }

            char[] ch = answer.toCharArray();
            Arrays.sort(ch);

            return String.valueOf(ch);
        }


        // HashMap을 통한 리팩토링
        public String solution1(String s) {
            Map<Character, Integer> charCount = new HashMap<>();

            // 각 문자의 등장횟수 count
            for (Character c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            // map좀 공부해야지..
            StringBuilder uniqueChars = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() == 1) {
                    uniqueChars.append(entry.getKey());
                }
            }

            char[] chAry = uniqueChars.toString().toCharArray();
            Arrays.sort(chAry);

            return new String(chAry);
        }
    }
}
