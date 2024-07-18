package Algorithm.Programers.코딩테스트_입문.part_21to40;

// 모음 제거
public class Programmers_29 {
    class Solution {
        public String solution(String my_string) {
            String answer = my_string;
            String[] vowels = {"a", "e", "i", "o", "u"};

            // replaceAll(찾을 문자열, 찾은 문자열을 바꿀 문자열)
            for (String v : vowels) {
                answer = answer.replaceAll(v, "");

                // 문자열 배열을 만들지 않고 정규식으로 할 수 있다 ㅠㅠ
                answer = answer.replaceAll("[aeiou]", "");
            }

            return answer;
        }
    }
}
