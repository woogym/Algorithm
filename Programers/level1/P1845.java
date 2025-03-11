package Algorithm.Programers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 폰켓몬
public class P1845 {
    class Solution {
        public int solution(int[] nums) {
            Set<Integer> pocketMon = new HashSet<>();

            int defaultValue = nums.length / 2;

            for (int i = 0; i < nums.length; i++) {
                pocketMon.add(nums[i]);
            }

            return Math.min(defaultValue, pocketMon.size());
        }

        // 코드 간결화
        public int refactoring1(int[] nums) {
            return Math.min(nums.length / 2, (int) Arrays.stream(nums).distinct().count());
        }

        // 성능 개선
        public int refactoring2(int[] nums) {
            boolean[] seen = new boolean[200_001];
            int uniqueCount = 0;
            int maxSelectable = nums.length / 2;

            for (int num : nums) {
                if (!seen[num]) {
                    seen[num] = true;
                    uniqueCount++;
                }

                if (uniqueCount == maxSelectable) {
                    return maxSelectable;
                }
            }

            return uniqueCount;
        }
    }
}
