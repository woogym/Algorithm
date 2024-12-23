package Algorithm.Programers.level0;

public class Programmers_14 {
    class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[(num_list.length + (n - 1)) / n];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = num_list[i * n];
            }

            return answer;
        }
    }
}
