package Algorithm.Programers.level0;

public class P181929 {
    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            int multiple = 1;
            int square = 0;

            for (int i : num_list) {
                multiple *= i;
            }

            for (int i : num_list) {
                square += i;
            }

            if (multiple < (square * square)) {
                answer = 1;
            }

            return answer;
        }
    }
}
