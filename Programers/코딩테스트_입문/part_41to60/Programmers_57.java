package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 피자 나눠 먹기 (2)
public class Programmers_57 {
    class Solution {
        public int solution(int n) {
            final int piece = 6;
            int answer;
            int num = 0;

            // 최소 공약수 구하기 로직인듯?
            while (true) {
                num++;
                if ((n * num) % piece == 0) {
                    answer = n * num / piece;
                    break;
                }
            }

            return answer;
        }
    }
}
