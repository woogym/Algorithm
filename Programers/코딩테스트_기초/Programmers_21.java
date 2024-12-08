package Algorithm.Programers.코딩테스트_기초;

// n보다 커질 때까지 더하기
public class Programmers_21 {
    class Solution {
        public int solution(int[] numbers, int n) {
            int num = 0;
            int answer = 0;

            for (int i = 0; i < numbers.length; i++) {
                num += numbers[i];

                if (num > n) {
                    answer = num;
                    break;
                }
            }

            return answer;
        }
    }
}
