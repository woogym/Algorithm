package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 문자열 계산하기
public class Programmers_75 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String[] str = my_string.split(" ");

            answer += Integer.parseInt(str[0]);

            for (int i = 0; i < str.length; i++) {
                if (str[i].equals("+")) {
                    answer += Integer.parseInt(str[i + 1]);
                }

                if (str[i].equals("-")) {
                    answer -= Integer.parseInt(str[i + 1]);
                }
            }


            return answer;
        }
    }
}
