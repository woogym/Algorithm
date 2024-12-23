package Algorithm.Programers.level0;

// 이어 붙인 수
public class Programmers_10 {
    class Solution {
        public int solution(int[] num_list) {
            int answer;
            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    num1.append(num_list[i]);
                } else {
                    num2.append(num_list[i]);
                }
            }

            answer = Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());

            return answer;
        }
    }
}
