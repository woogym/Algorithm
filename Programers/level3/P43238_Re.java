package Algorithm.Programers.level3;

import java.util.Arrays;

// 입국 심사 - 이중 탐색 문제
public class P43238_Re {
    class Solution {
        public long solution(int n, int[] times) {
            long answer = 0;
            Arrays.sort(times);
            long left = 0;
            long right = (long) times[times.length - 1] * (long) n;

            while (left <= right) {
                long mid = (left + right) / 2;
                long count = 0;

                for (int i = 0; i < times.length; i++) {
                    count += mid / times[i];
                }

                if (count < n) {
                    left = mid + 1;
                } else {
                    answer = mid;
                    right = mid - 1;
                }
            }

            return answer;
        }
    }
}
