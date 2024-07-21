package Algorithm.Programers.코딩테스트_입문.part_21to40;

public class Programmers_32 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                char c = my_string.charAt(i);
                // isUpperCase와 같이 대소문자를 판별할 수 있는 메소드들을 기억할것
                if (Character.isUpperCase(c)) {
                    answer += Character.toString(c).toLowerCase();
                } else {
                    answer += Character.toString(c).toUpperCase();
                }
            }

            return answer;
        }
    }
}
