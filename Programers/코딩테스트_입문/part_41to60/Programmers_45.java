package Algorithm.Programers.코딩테스트_입문.part_41to60;

import java.util.HashSet;
import java.util.List;

// 문자열안에 문자열
public class Programmers_45 {
    class Solution {
        public int solution(String str1, String str2) {
            int answer = 2;

            if (str1.contains(str2)) {
                answer = 1;
            }

            return answer;
        }
    }
}
