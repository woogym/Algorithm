package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 이진수 더하기
public class Programmers_72 {
    class Solution {
        public String solution(String bin1, String bin2) {
            String answer = "";
            int num1 = Integer.parseInt(bin1, 2);
            int num2 = Integer.parseInt(bin2, 2);

            answer = Integer.toBinaryString(num1 + num2);

            return answer;
        }
    }
}
