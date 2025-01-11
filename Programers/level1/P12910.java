package Algorithm.Programers.level1;

import java.util.ArrayList;
import java.util.List;

public class P12910 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            List<Integer> answer = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer.add(arr[i]);
                }
            }

            if (answer.isEmpty()) {
                answer.add(-1);
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .sorted()
                    .toArray();
        }
    }
}
