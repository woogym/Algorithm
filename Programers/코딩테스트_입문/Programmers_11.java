package Algorithm.Programers.코딩테스트_입문;

public class Programmers_11 {
    class Solution {
        public int solution(int num1, int num2) {

            double division = (double) num1 / num2;

            double result = division * 1000;

            return (int) result;
        }
    }
}
