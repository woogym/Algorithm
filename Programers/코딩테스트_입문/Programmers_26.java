package Algorithm.Programers.코딩테스트_입문;


import java.util.Arrays;

// 배열 자르기
public class Programmers_26 {
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2 - num1 + 1];
            int k = 0;

            for (int i = num1; i <= num2; i++) {
                answer[k++] = numbers[i];
            }

            return answer;
        }

        public int[] solution1(int[] numbers, int num1, int num2) {
            return Arrays.copyOfRange(numbers, num1, num2 + 1);
        }
    }
}
