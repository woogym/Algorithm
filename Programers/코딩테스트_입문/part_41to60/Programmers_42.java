package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 피자 나눠 먹기 (3)
public class Programmers_42 {
    class Solution {
        public int solution(int slice, int n) {
            int answer = 0;

            if ((n % slice) != 0) {
                answer = n / slice + 1;
            } else {
                answer = n / slice;
            }

            return answer;
        }

        // 리팩토링
        public int solution1(int slice, int n) {
            int answer = n / slice;

            if (n % slice != 0) {
                answer++;
            }

            return answer;
        }
    }
}
