package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 분수의 덧셈
public class Programmers_95 {
    class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int[] answer = new int[2];
            int denom = denom1 * denom2;
            int numer = numer1 * denom2 + numer2 * denom1;
            int gcd = gCD(denom, numer);

            answer[0] = numer / gcd;
            answer[1] = denom / gcd;

            return answer;
        }

        public int gCD(int num1, int num2) {
            int round;
            while(num2 > 0) {
                round = num1 % num2;
                num1 = num2;
                num2 = round;
            }

            return num1;
        }
    }
}
