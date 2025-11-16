package Algorithm.Programers.level1;

// 삼총사
public class P131705_2 {
    class Solution {

        private int count = 0;
        private int[] numbers;

        public int solution(int[] number) {
            this.numbers = number;

            dfs(0, 0, 0);

            return count;
        }

        private void dfs(int start, int depth, int sum) {
            if (depth == 3 && sum == 0) {
                count++;
                return;
            }

            for (int i = start; i < numbers.length; i++) {
                dfs(i + 1, depth + 1, sum + numbers[i]);
            }
        }
    }
}
