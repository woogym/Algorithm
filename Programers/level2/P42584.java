package Algorithm.Programers.level2;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

// 주식 가격
public class P42584 {
    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];

            for (int i = 0; i < prices.length; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    answer[i]++;
                    if (prices[i] > prices[j]) {
                        break;
                    }
                }
            }

            return answer;
        }
    }
}
