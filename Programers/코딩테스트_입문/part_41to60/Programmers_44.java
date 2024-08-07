package Algorithm.Programers.코딩테스트_입문.part_41to60;

import java.util.Arrays;
import java.util.HashSet;

// 배열의 유사도
public class Programmers_44 {
    class Solution {
        public int solution(String[] s1, String[] s2) {
            int count = 0;

            for (int i = 0; i < s1.length; i++) {
                String s1Str = s1[i];
                for (int j = 0; j < s2.length; j++) {
                    if (s1Str.equals(s2[j])) {
                        count++;
                    }
                }
            }

            return count;
        }

        // 리팩토링 forEach문 손에 잘 안익음..
        public int solution2(String[] s1, String[] s2) {
            int answer = 0;

            for (String str1 : s1) {
                for (String str2 : s1) {
                    if (str1.equals(str2)) {
                        answer++;
                        break;
                    }
                }
            }

            return answer;
        }

        // HashSet을 사용해서 solution1,2의 시간복잡도 O(nxm)을 o(n+m)으로 줄이기
        public int solution3(String[] s1, String[] s2) {
            int count = 0;
            HashSet<String> set = new HashSet<>(Arrays.asList(s1));

            for (String str : s2) {
                if (set.contains(str)) {
                    count++;
                }
            }

            return count;
        }
    }
}
