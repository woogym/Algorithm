package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 369게임
public class Programmers_52 {
    class Solution {
        public int solution(int order) {
            int answer = 0;

            String orderStr = String.valueOf(order);

            for (int i = 0; i < orderStr.length(); i++) {
                if (String.valueOf(orderStr.charAt(i)).contains("3")) {
                    answer++;
                } else if (String.valueOf(orderStr.charAt(i)).contains("6")) {
                    answer++;
                } else if (String.valueOf(orderStr.charAt(i)).contains("9")) {
                    answer++;
                }
            }

            return answer;
        }

        public int solution1(int order) {
            int answer = 0;

            String str = order + "";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '3' || c == '6' || c == '9') {
                    answer++;
                }
            }

            return answer;
        }
    }
}
