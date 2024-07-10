package Algorithm.Programers.코딩테스트_입문;

// 짝수는 싫어욧
public class Programmers_22 {
    class Solution {
        public int[] solution(int n) {
            // 1~15중 10보다 작다면
            int[] answer = new int[(n + 1) / 2];

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    answer[i/2] = i;
                }
            }

            return answer;
        }
    }
}
