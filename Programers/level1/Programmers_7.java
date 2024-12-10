package Algorithm.Programers.level1;

// 문자열 정수로 바꾸기
public class Programmers_7 {
    class Solution {
        public int solution(String s) {

            if (s.startsWith("-")) {
                return Integer.parseInt(s.substring(1)) * -1;
            }

            return Integer.parseInt(s);
        }
    }
}
