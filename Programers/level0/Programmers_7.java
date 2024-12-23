package Algorithm.Programers.level0;

// 문자열 정수로 바꾸기
public class Programmers_7 {
    class Solution {
        public int solution(String s) {

            if (s.startsWith("-")) {
                return Integer.parseInt(s.substring(1)) * -1;
            }

            return Integer.parseInt(s);
        }

        // 이렇게 해도 됨 -> parseInt는 산술 연산 부호까지 파싱해줌
        public int solution1(String s) {
            return Integer.parseInt(s);
        }
    }
}
