package Algorithm.Programers.코딩테스트_입문;

// 피자 나눠 먹기
public class Programmers_23 {
    class Solution {
        public int solution(int n) {
            int answer = 1;

            if (n > 7 && n % 7 != 0) {
                answer = (n / 7) + 1;
            } else if (n % 7 == 0){
                answer = n / 7;
            }

            return answer;
        }

        public int solution2(int n) {
            return (n + 6) / 7;
        }
    }
}
