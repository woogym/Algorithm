package Algorithm.Programers.level0;

public class Programmers_8 {
    class Solution {
        public long solution(int a, int b) {
            long answer = 0;

            if (a <= b) {
                for (int i = a; i <= b; i++) {
                    answer += i;
                }
            } else {
                for (int i = b; i <= a; i++) {
                    answer += i;
                }
            }


            return answer;
        }

        public long solution1(int a, int b) {
            long answer = 0;

            for (int i = Math.min(a,b); i < Math.max(a,b); i++) {
                answer += i;
            }

            return answer;
        }
    }
}
