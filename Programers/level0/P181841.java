package Algorithm.Programers.level0;

public class P181841 {
    class Solution {
        public String solution(String[] str_list, String ex) {
            StringBuilder answer = new StringBuilder();

            for (String s : str_list) {
                if (!s.contains(ex)) {
                    answer.append(s);
                }
            }

            return answer.toString();
        }
    }
}
