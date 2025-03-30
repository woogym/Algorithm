package Algorithm.Programers.level2;

import java.util.ArrayDeque;
import java.util.Deque;

// 다리를 지나는 트럭
public class P42583 {
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Deque<Integer> bridge = new ArrayDeque<>(bridge_length);
            int currentTime = 0;
            int currentBridgeWeight = 0;
            int truckIndex = 0;

            for (int i = 0; i < bridge_length; i++) {
                bridge.offer(0);
            }

            while (truckIndex < truck_weights.length && !bridge.isEmpty()) {
                currentBridgeWeight -= bridge.poll();
                currentTime++;

                if (currentBridgeWeight + truck_weights[truckIndex] <= weight) {
                    bridge.offerLast(truck_weights[truckIndex]);
                    currentBridgeWeight += truck_weights[truckIndex++];
                } else {
                    bridge.offer(0);
                }
            }

            return currentTime + bridge_length;
        }
    }
}
