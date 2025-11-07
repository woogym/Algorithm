package Algorithm.Programers.level1;

// 소수 만들기
public class P12977_2 {
    class Solution {

        private int count = 0;

        public int solution(int[] nums) {

            dfs(0, 0, 0, nums);

            return count;
        }

        private void dfs(int depth, int start, int sum, int[] nums) {
            if (depth == 3) {
                if (isPrime(sum)) {
                    count++;
                }
                return; // 재귀에서의 조건분기의 중요한 점은 수많이 적은 재귀호출로 결과값을 도출할 수 있어야함 해당 분기가 없으면 SOF가 발생한다..
            }

            for (int i = start; i < nums.length; i++) {
                dfs(depth + 1, i + 1, sum + nums[i], nums);
            }
        }

        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            int squareRoot = (int) Math.sqrt(num);
            for (int i = 2; i <= squareRoot; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
