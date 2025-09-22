package Algorithm.Programers.level2;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;

// 프로세스
public class P42587 {
    class Solution {
        // 개선 코드
        public int refactoring(int[] priorities, int location) {
            int answer = 0;
            // 우선순위 큐 생성
            ArrayDeque<int[]> ad = new ArrayDeque<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            // 덱에 순서대로 priorities 삽입
            for (int i = 0; i < priorities.length; i++) {
                ad.add(new int[] {priorities[i], i});
                maxHeap.add(priorities[i]);
            }

            while (!ad.isEmpty()) {
                int[] front = ad.pollFirst();
                int peek = front[0];
                int idx = front[1];

                if (peek < maxHeap.peek()) {
                    ad.offerLast(front);
                    continue;
                }

                answer++;
                maxHeap.poll();
                if (idx == location) {
                    return answer;
                }
            }

            return answer;
        }

        // 기존 코드
        public int solution(int[] priorities, int location) {
            int answer = 0;
            // 우선순위 큐 생성
            ArrayDeque<int[]> ad = new ArrayDeque<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            // 덱에 순서대로 priorities 삽입
            for (int i = 0; i < priorities.length; i++) {
                ad.add(new int[] {priorities[i], i});
                pq.add(priorities[i]);
            }

            while (!ad.isEmpty()) {
                int[] front = ad.peek();
                int peek = front[0];
                int idx = front[1];

                if (peek < pq.peek()) {
                    ad.offerLast(ad.pollFirst());
                } else {
                    int[] maxValue = ad.pollFirst();
                    answer++;

                    if (idx == location) {
                        return answer;
                    }

                    pq.poll();
                }
            }

            return answer;
        }
    }
}
