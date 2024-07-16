package Algorithm.Programers.코딩테스트_입문.part_1to20;

// 두 수의 차 구하기
public class Programmers_2 {

    class Solution {
        public int solution(int num1, int num2) {
            int answer;

            if ((-50000 <= num1 && num1 <= 50000) && (-50000 <= num2 && num2 <= 50000)) {
                answer = num1 - num2;
            } else {
                answer = 1;
            }

            return answer;
        }
    }
}
