package Algorithm.Programers.level1;

import java.util.ArrayList;
import java.util.List;

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
