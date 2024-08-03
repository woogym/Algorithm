package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 문자 반복 출력하기
public class Programmers_46 {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            String[] ary = my_string.split("");

            for (String str : ary) {
                for (int i = 0; i < n; i++) {
                    answer += str;
                }
            }

            return answer;
        }

        // repeat는 시간측면에서 아쉬운면이 있음.. string은 오려붙이기하면 안될거 같은..
        public String solution1(String my_string, int n) {
            StringBuilder sb = new StringBuilder();

            for (char c : my_string.toCharArray()) {
                sb.append((c + "").repeat(n));
            }

            return sb.toString();
        }
    }
}
