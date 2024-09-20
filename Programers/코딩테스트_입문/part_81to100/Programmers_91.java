package Algorithm.Programers.코딩테스트_입문.part_81to100;

import java.util.HashMap;
import java.util.Map;

// 최빈값 구하기
public class Programmers_91 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;
            int maxCount = 0;

            Map<Integer, Integer> map = new HashMap<>();

            for (int i : array) {
                int count = map.getOrDefault(i, 0) + 1;

                if (count > maxCount) {
                    maxCount = count;
                    answer = i;
                } else if (count == maxCount) {
                    answer = -1;
                }

                map.put(i, count);
            }

            return answer;
        }
    }
}
