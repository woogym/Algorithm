package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 합성수 찾기
public class Programmers_58 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            // 4 6 8 9 10
            for (int i = 4; i <= n; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                if (count >= 3) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
