package Algorithm.Programers.level1;

// 최대공약수와 최소공배수
public class P12940 {
    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[2];

            answer[0] = getGCD(n, m);
            answer[1] = getLCM(n, m, answer[0]);
            return answer;
        }

        private int getGCD(int num1, int num2) {
            if (num1 % num2 == 0) {
                return num2;
            }

            return getGCD(num2, num1 % num2);
        }

        private int getLCM(int num1, int num2, int gcd) {
            int a = num1 / gcd;
            int b = num2 / gcd;

            return gcd * a * b;
        }
    }
}
