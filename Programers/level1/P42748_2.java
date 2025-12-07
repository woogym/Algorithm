package Algorithm.Programers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// K번째 수
public class P42748_2 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            List<Integer> answer = new ArrayList<>();

            for (int[] command : commands) {
                int start = command[0] - 1; // 1
                int end = command[1] - 1; // 4
                int order = command[2] - 1; // 2
                List<Integer> copy = new ArrayList<>();

                for (int i = start; i <= end ; i++) {
                    copy.add(array[i]);
                }

                Collections.sort(copy); // 2 3 5 6
                answer.add(copy.get(order));
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
