package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 중복된 문자 제거
public class Programmers_59 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for (int i = 0; i < my_string.length(); i++) {
                String str = String.valueOf(my_string.charAt(i));
                if (!answer.contains(str)) {
                    answer += str;
                }
            }

            return answer;
        }
    }
}
