package Algorithm.Programers.level1;

// 약수의 개수와 덧셈
public class P77884 {
    class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            for (int i = left; i <= right; i++) {
                int minimumDivisorCount = minumumDivisor(i);
                if (minimumDivisorCount % 2 == 0) {
                    answer += i;
                } else {
                    answer -= i;
                }
            }

            return answer;
        }

        public int minumumDivisor(int number) {
            int count = 0;
            for (int i = 1; i * i <= number; i++) {
                if (i * i == number) {
                    count++;
                } else if (number % i == 0) {
                    count += 2;
                }
            }

            return count;
        }

        public int refactoring(int left, int right) {
            int answer = 0;

            for (int i = left; i <= right; i++) {
                if (i % Math.sqrt(i) == 0) { // 제곱수인 경우 약수의 개수가 홀수~
                    answer -= i;
                } else {
                    answer += i;
                }
            }

            return answer;
        }
    }
}
