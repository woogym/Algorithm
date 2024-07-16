package Algorithm.Programers.코딩테스트_입문.part_1to20;

// 두 수 나누기
public class Programmers_4 {

    class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;
            boolean num1Boolean1 = 0 <= num1;
            boolean num1Boolean2 = num1 <= 100;
            boolean num2Boolean1 = 0 <= num2;
            boolean num2Boolean2 = num2 <= 100;

            if (num1Boolean1 && num1Boolean2 && num2Boolean1 && num2Boolean2) {
                answer += num1 / num2;
            }

            return answer;
        }
    }
}
