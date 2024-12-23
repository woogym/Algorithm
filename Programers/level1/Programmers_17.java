package Algorithm.Programers.level1;

// n번째 원소부터
public class Programmers_17 {
    class Solution {
        public int[] solution(int[] num_list, int n) {
            int[] answer = new int[num_list.length - n + 1];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = num_list[i + (n - 1)];
            }

            return answer;
        }
    }
}
