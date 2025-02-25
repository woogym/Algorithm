package Algorithm.Programers.level0;

// 부분 문자열 이어 붙여 문자열 만들기
public class P181911 {
    class Solution {
        public String solution(String[] my_strings, int[][] parts) {
            StringBuilder answer = new StringBuilder();

            for (int i = 0; i < my_strings.length; i++) {
                answer.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
            }

            return answer.toString();
        }
    }
}
