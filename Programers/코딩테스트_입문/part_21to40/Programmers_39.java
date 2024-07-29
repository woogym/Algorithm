package Algorithm.Programers.코딩테스트_입문.part_21to40;

import java.util.Arrays;

// 최댓값 만들기(2)
public class Programmers_39 {
    class Solution {
        public int solution(int[] numbers) {
            int answer;

            int[] ary = Arrays.stream(numbers).sorted().toArray();

            int negative = ary[0] * ary[1];
            int positive = ary[ary.length - 1] * ary[ary.length - 2];

            if (negative < positive) {
                answer = positive;
            } else {
                answer = negative;
            }

            return answer;
        }

        // Math객체를 잘 사용해보자!
        public int solution1(int[] numbers) {
            Arrays.sort(numbers);

            return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
        }
    }
}
