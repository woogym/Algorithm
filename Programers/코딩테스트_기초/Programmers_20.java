package Algorithm.Programers.코딩테스트_기초;

// 문자열 합치기
public class Programmers_20 {
    class Solution {
        public String solution(String my_string, int k) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < k; i++) {
                sb.append(my_string);
            }

            return sb.toString();
        }
    }
}
