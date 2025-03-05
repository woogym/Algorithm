package Algorithm.Programers.level0;

import java.util.ArrayList;
import java.util.List;

public class P181861 {
    class Solution {
        public int[] solution(int[] arr) {
            List<Integer> answer = new ArrayList<>();

            for (int i : arr) {
                for (int j = 0; j < i; j++) {
                    answer.add(i);
                }
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
