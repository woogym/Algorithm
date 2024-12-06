package Algorithm.Programers.코딩테스트_기초;

public class Programmers_19 {
    class Solution {
        public int solution(int a, int b) {
            int sum1 = Integer.parseInt(a + "" + b);
            int sum2 = 2 * a * b;

            if (sum1 >= sum2) {
                return sum1;
            }

            return sum2;
        }
    }
}
