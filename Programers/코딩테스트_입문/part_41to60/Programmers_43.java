package Algorithm.Programers.코딩테스트_입문.part_41to60;

import java.util.Arrays;

// 최댓값 만들기 (1)
public class Programmers_43 {
    class Solution {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);
            return numbers[numbers.length - 1] * numbers[numbers.length - 2];
        }
    }
}
