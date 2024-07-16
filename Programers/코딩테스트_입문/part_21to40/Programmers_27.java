package Algorithm.Programers.코딩테스트_입문.part_21to40;

// 순서쌍의 개수
public class Programmers_27 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                if ((n % i) == 0) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
