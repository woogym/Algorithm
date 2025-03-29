package Algorithm.Programers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 기능 개발
public class P42586 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> answer = new ArrayList<>();
            int[] days = new int[speeds.length];

            for (int i = 0; i < progresses.length; i++) {
                days[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            }

            Queue<Integer> q = new LinkedList<>();
            for (int day : days) {
                q.add(day);
            }

            while (!q.isEmpty()) {
                int currentDays = q.poll();
                int count = 1;

                while (!q.isEmpty() && q.peek() <= currentDays) {
                    q.poll();
                    count++;
                }

                answer.add(count);
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
