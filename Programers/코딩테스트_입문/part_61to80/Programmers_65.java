package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 숨어있는 숫자들의 덧셈(2)
public class Programmers_65 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

            for (String s : str) {
                if (!s.equals("")) {
                    answer += Integer.parseInt(s);
                }
            }

            return answer;
        }
    }
}
