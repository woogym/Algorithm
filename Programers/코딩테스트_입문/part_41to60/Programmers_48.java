package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 특정 문자 제거하기
public class Programmers_48 {
    class Solution {
        public String solution(String my_string, String letter) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                if (my_string.charAt(i) != letter.charAt(0)) {
                    answer += String.valueOf(my_string.charAt(i));
                }
            }
            return answer;
        }

        // replace 메서드 해당하는 문자열 교체해주는 문자열 메소드 기억하기
        public String solution1(String my_string, String letter) {
            return my_string.replace(letter, "");
        }
    }
}
