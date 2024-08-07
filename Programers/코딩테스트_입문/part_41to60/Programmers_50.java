package Algorithm.Programers.코딩테스트_입문.part_41to60;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

public class Programmers_50 {
    class Solution {
        public String solution(String rsp) {
            String answer = "";
            final char rock = '0';
            final char scissors = '2';
            final char paper = '5';

            for (int i = 0; i < rsp.length(); i++) {
                if (rsp.charAt(i) == rock) {
                    answer += String.valueOf(paper);
                } else if (rsp.charAt(i) == scissors) {
                    answer += String.valueOf(rock);
                } else {
                    answer += String.valueOf(scissors);
                }
            }

            return answer;
        }

        // 다양하게 자료구조 사용할줄 알기!
        public String solution1(String rsp) {
            Map<String, String> winNumbers = new HashMap<>();

            // 2 - 가위, 0 - 바위, 5 - 보
            winNumbers.put("2", "0");
            winNumbers.put("0", "5");
            winNumbers.put("5", "2");

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < rsp.length(); i++) {
                sb.append(winNumbers.get(rsp.substring(i, i + 1)));
            }

            return sb.toString();
        }
    }
}
