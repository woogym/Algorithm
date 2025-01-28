package Algorithm.Programers.level0;

public class P181935 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n % 2 == 0) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        answer += (int) Math.pow(i,2);
                    }
                }

                return answer;
            } else {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 1) {
                        answer += i;
                    }
                }

                return answer - 1;
            }
        }
    }
}
