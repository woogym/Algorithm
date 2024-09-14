package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 저주의 숫자 3
public class Programmers_86 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 0; i < n; i++) {
                answer++;
                while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
