package Algorithm.Programers.level1;

import java.util.*;

public class Programmers_2 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String[] num = String.valueOf(n).split("");

            for (String string : num) {
                answer += Integer.parseInt(string);
            }

            return answer;
        }
    }
}
