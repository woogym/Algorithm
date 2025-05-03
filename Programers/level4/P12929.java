package Algorithm.Programers.level4;

// 올바른 괄호의 갯수
public class P12929 {
    class Solution {

        private int count = 0;

        public int solution(int n) {

            dfs(0, 0, n);

            return count;
        }

        private void dfs(int open, int close, int max) {
            if (open == max && close == max) {
                count++;
            }

            if (open < max) {
                dfs(open + 1, close, max);
            }

            if (close < open) {
                dfs(open, close + 1, max);
            }
        }
    }
}
