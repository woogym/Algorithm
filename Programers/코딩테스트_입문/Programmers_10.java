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

        // 또 다른 풀이1
        // 매개변수로 들어오는 원본 값에 대한 변형이 이루어지지 않는다,
        // 따라서 다른곳에서 해당 메소드가 활용될때 해당 메소드의 인자값으로 들어온 값은 변형이 이루어지지 않는다
        public int solution1(int number) {
            int answer = 0;

            for (int i = 2; i <= number; i += 2) {
                answer += i;
            }

            return answer;
        }
    }
}
