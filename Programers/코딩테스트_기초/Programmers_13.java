package Algorithm.Programers.코딩테스트_기초;

// A 강조하기
public class Programmers_13 {
    class Solution {
        public String solution(String myString) {
            StringBuilder sb = new StringBuilder();
            String str = myString.replaceAll("a", "A");

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A') {
                    sb.append(str.charAt(i));
                    continue;
                }
                sb.append(Character.toLowerCase(str.charAt(i)));
            }

            return sb.toString();
        }
    }
}
