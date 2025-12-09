package Algorithm.Programers.level1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

// 같은 숫자는 싫엉~
public class P12906_2 {
    public class Solution {
        public int[] solution(int []arr) {
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            List<Integer> answer = new ArrayList<>();

            for (int i : arr) {
                deque.add(i);
            }

            int before = -1;
            while (!deque.isEmpty()) {
                int idx = deque.pollFirst();
                if (before == idx) {
                    continue;
                } else {
                    answer.add(idx);
                    before = idx;
                }
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
