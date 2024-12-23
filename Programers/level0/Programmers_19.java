package Algorithm.Programers.level0;

// 카운트 다운
public class Programmers_19 {
    class Solution {
        public int[] solution(int start_num, int end_num) {
            int[] answer = new int[start_num - end_num + 1];
            int index = 0;

            for (int i = start_num; end_num <= i; i--) {
                answer[index++] = i;
            }

            return answer;
        }
    }
}
