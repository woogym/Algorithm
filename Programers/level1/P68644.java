package Algorithm.Programers.level1;

import java.util.HashSet;
import java.util.Set;

// 두 개 뽑아서 더하기
public class P68644 {
    class Solution {

        private Set<Integer> number = new HashSet<>();

        public int[] solution(int[] numbers) {

            dfs(0, 0, 0, numbers);

            return number.stream()
                    .sorted()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        private void dfs(int depth, int start, int sum, int[] numbers) {
            if (depth == 2) {
                number.add(sum);
                return;
            }

            for (int i = start; i < numbers.length; i++) {
                dfs(depth + 1, i + 1, sum + numbers[i], numbers);
            }
        }
    }
}
