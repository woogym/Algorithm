package Algorithm.Programers.코딩테스트_입문.part_1to20;

import java.util.Arrays;

public class Programmers_20 {
    class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }

            return answer;
        }

        // 이런식으로 stream으로 풀 수 있음
        public int[] solution2(int[] numbers) {
            return Arrays.stream(numbers).map(i -> i * 2).toArray();
        }
    }
}
