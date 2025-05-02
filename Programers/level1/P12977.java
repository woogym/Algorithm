package Algorithm.Programers.level1;

// 소수 만들기
public class P12977 {
    class Solution {

        private int count = 0;
        private int[] nums;

        public int solution(int[] nums) {
            this.nums = nums;
            dfs(0,0,0);

            return count;
        }

        private void dfs(int depth, int start, int sum) {
            if (depth == 3) {
                if (isPrime(sum)) {
                    count++;
                }
                return;
            }

            for (int i = start; i < nums.length; i++) {
                dfs(depth + 1, i + 1, sum + nums[i]);
            }
        }

        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            int sqrt = (int) Math.sqrt(num);
            for (int i = 2; i <= sqrt; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
