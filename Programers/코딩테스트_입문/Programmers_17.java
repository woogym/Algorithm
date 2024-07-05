package Algorithm.Programers.코딩테스트_입문;

// 사분면 찾기
public class Programmers_17 {
    class Solution {
        public int solution(int[] dot) {
            int answer = 0;

            if ((dot[0] + dot[1]) < 0) {
                answer = 3;
            }

            if (dot[0] < 0 && dot[1] > 0) {
                answer = 2;
            }

            if (dot[0] > 0 && dot[1] > 0) {
                answer = 1;
            }

            if (dot[0] > 0 && dot[1] < 0) {
                answer = 4;
            }

            return answer;
        }
    }
}
