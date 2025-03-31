package Algorithm.Programers.level1;

import java.util.*;

// 같은 숫자는 싫어
public class P12906 {
    public class Solution {
        public int[] solution(int []arr) {
            Deque<Integer> answer = new ArrayDeque<>();
            int currentIndex = 0;

            answer.offerLast(arr[currentIndex]);
            currentIndex++;

            while (currentIndex < arr.length) {
                if (arr[currentIndex] == answer.getLast()) {
                    currentIndex++;
                    continue;
                }

                answer.offerLast(arr[currentIndex]);
                currentIndex++;
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
