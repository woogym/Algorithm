package Algorithm.Programers.코딩테스트_입문.part_1to20;

// 문자열 뒤집기
public class Programmers_16 {
    class Solution {
        public String solution(String myString) {
            StringBuilder sb = new StringBuilder();

            sb.append(myString);
            sb.reverse();

            return sb.toString();
        }
    }
}
