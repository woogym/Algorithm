package Algorithm.Programers.코딩테스트_입문.part_1to20;

public class Programmers_11 {
    class Solution {

        public int solution(int num1, int num2) {

            double division = (double) num1 / num2;

            double result = division * 1000;

            return (int) result;
        }

        // 이런 방법이.. 수학적 사고..
        public int solution1(int num1, int num2) {
            int answer = 0;

            return num1 * 1000 / num2;
        }
    }
}
