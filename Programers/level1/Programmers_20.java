package Algorithm.Programers.level1;

// 문자열의 앞의 n글자
public class Programmers_20 {
    class Solution {
        public String solution(String my_string, int n) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                sb.append(my_string.charAt(i));
            }

            return sb.toString();
        }
    }
}
