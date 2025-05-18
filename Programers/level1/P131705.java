package Algorithm.Programers.level1;

import java.util.ArrayList;
import java.util.List;

// 삼총사
public class P131705 {
    class Solution {

        private int count = 0;

        public int solution(int[] number) {

            dfs(0, 0, 0, number);

            return count;
        }

        private void dfs(int depth, int start, int sum, int[] numbers) {
            if (depth == 3) {
                if (sum == 0) count++;
                return;
            }

            for (int i = start; i < numbers.length; i++) {
                dfs(depth + 1, i + 1, sum + numbers[i], numbers);
            }
        }
    }
}
