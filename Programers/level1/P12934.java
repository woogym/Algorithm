package Algorithm.Programers.level1;

public class P12934 {
    class Solution {
        public long solution(long n) {
            double answer = Math.sqrt(n);

            if (answer == (int) answer) {
                return (long) Math.pow(answer + 1, 2);
            }

            return -1;
        }
    }
}
