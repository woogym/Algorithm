package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 유한소수 판별하기
public class Programmers_87 {
    class Solution {
        public int solution(int a, int b) {
            int num = b / GCD(a, b);

            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else if (num % 5 == 0) {
                    num /= 5;
                } else {
                    return 2;
                }
            }

            return 1;
        }

        // 유클리드 호제법
        private int GCD(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return GCD(b, a % b);
            }
        }

        // 또다른 벽느껴지는 풀이..
        // 최대값이 1000이라는 점을 고려
        public int solution1(int a, int b) {
            return ((a*1000)%b == 0) ? 1 : 2;
        }
    }
}
