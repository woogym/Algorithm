package Algorithm.Programers.level2;

import java.util.PriorityQueue;

// 더 맵게
public class P42626_2 {
    class Solution {
        public int solution(int[] scoville, int K) {
            int count = 0;
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

            for (int i : scoville) {
                priorityQueue.add(i);
            }

            while (priorityQueue.peek() < K) {
                if (priorityQueue.size() == 1) {
                    return -1;
                }

                int minScoville = priorityQueue.poll();
                int nextMinScoville = priorityQueue.poll();
                int suffle = minScoville + (nextMinScoville * 2);

                priorityQueue.offer(suffle);
                count++;
            }

            return count;
        }
    }
}