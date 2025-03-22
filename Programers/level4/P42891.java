package Algorithm.Programers.level4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

// 무지의 먹방 라이브 - 2019 Kakao Blind Recruitment (ㅅㅂ 너무 어렵네)
public class P42891 {
    class Solution {
        public int solution(int[] food_times, long k) {
            long sum = 0;
            for (int time : food_times) {
                sum += time;
            }

            if (sum <= k) {
                return -1;
            }

            PriorityQueue<Food> pq = new PriorityQueue<>(Comparator.comparingInt(food -> food.time));
            for (int i = 0; i < food_times.length; i++) {
                pq.offer(new Food(i + 1, food_times[i]));
            }

            long totalTime = 0;
            long previousTime = 0;
            int remainingFoodCount = food_times.length;

            while (!pq.isEmpty()) {
                long currentTime = pq.peek().time;
                long diff = currentTime - previousTime;
                long spend = diff * remainingFoodCount;

                if (totalTime + spend <= k) {
                    totalTime += spend;
                    previousTime = currentTime;
                    pq.poll();
                    remainingFoodCount--;
                } else {
                    break;
                }
            }

            ArrayList<Food> remainingFoods = new ArrayList<>();
            while (!pq.isEmpty()) {
                remainingFoods.add(pq.poll());
            }

            remainingFoods.sort(Comparator.comparingInt(food -> food.index));

            long offset = (k - totalTime) % remainingFoodCount;
            return remainingFoods.get((int) offset).index;
        }
    }

    class Food implements Comparable<Food> {
        int index; // 음식의 원래 번호 (1부터 시작)
        int time;  // 해당 음식을 먹는데 필요한 시간

        public Food(int index, int time) {
            this.index = index;
            this.time = time;
        }

        @Override
        public int compareTo(Food other) {
            return this.time - other.time;
        }
    }
}
