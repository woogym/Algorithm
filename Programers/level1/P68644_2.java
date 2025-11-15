package Algorithm.Programers.level1;

import java.util.HashSet;
import java.util.Set;

public class P68644_2 {
    class Solution {

        Set<Integer> result = new HashSet<>();
        private int[] numbers;

        public int[] solution(int[] numbers) {
            this.numbers = numbers;

            dfs(0, 0, 0);

            return result.stream()
                    .mapToInt(Integer::intValue)
                    .sorted()
                    .toArray();
        }

        private void dfs(int depth, int start, int sum) {
            if (depth == 2) {
                result.add(sum);
                return; // 재귀에서의 목표값 분기처리에 신경쓸것..
            }

            for (int i = start; i < numbers.length; i++) {
                dfs(depth + 1, i + 1, sum + numbers[i]);
            }
        }
    }
}
