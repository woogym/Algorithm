package Algorithm.Programers.level2;

import java.util.PriorityQueue;

// 더 맵게
public class P42626 {
    class Solution {
        int count = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        public int solution(int[] scoville, int K) {
            for (int i : scoville) {
                priorityQueue.add(i);
            }

            while (priorityQueue.peek() < K) {
                if (priorityQueue.size() < 2) {
                    return -1;
                }

                addScoville(priorityQueue);
            }

            return count;
        }

        private void addScoville (PriorityQueue priorityQueue) {
            int firstMinimumFoodScoville = (int) priorityQueue.poll();
            int secondMinimumFoodScoville = (int) priorityQueue.poll();
            int suffle = firstMinimumFoodScoville + secondMinimumFoodScoville * 2;

            priorityQueue.add(suffle);
            count++;
        }
    }
}
