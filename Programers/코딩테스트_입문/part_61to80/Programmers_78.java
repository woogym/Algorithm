package Algorithm.Programers.코딩테스트_입문.part_61to80;

import java.util.Arrays;

// 삼각형의 완성조건(2)
public class Programmers_78 {
    class Solution {
        public int solution(int[] sides) {
            int count = 0;
            int[] array = Arrays.stream(sides).sorted().toArray();

            // 가장 긴 변이 주어졌을때
            for (int i = array[1] - array[0] + 1; i <= array[1]; i++) {
                count++;
            }

            // 나머지 한 변이 가장 긴 변인 경우
            for (int i = array[1] + 1; i < array[0] + array[1]; i++) {
                count++;
            }

            return count;
        }

        // 최소값
        public int solution1(int[] sides) {
            int answer = 0;
            int min = Math.min(sides[0], sides[1]);

            answer += min * 2 - 1;

            return answer;
        }
    }
}
