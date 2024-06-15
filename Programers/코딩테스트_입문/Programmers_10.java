package Algorithm.Programers.코딩테스트_입문;

public class Programmers_10 {
    class Solution {
        public int solution(int number) {
            int answer = 0;

            if (number % 2 != 0) {
                number--;
            }

            while (number >= 0) {
                answer += number;
                number -= 2;
            }

            return answer;
        }
    }
}
