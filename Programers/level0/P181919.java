package Algorithm.Programers.level0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P181919 {
    class Solution {
        public int[] solution(int n) {
            List<Integer> answer = new ArrayList<>();
            answer.add(n);

            while (n > 1) {
                if (n % 2 == 0) {
                    answer.add(n / 2);
                    n = n / 2;
                } else {
                    answer.add((n * 3) + 1);
                    n = (n * 3) + 1;
                }
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }

        public int[] refactoring(int n) {
            Queue<Integer> answer = new LinkedList<>();

            while (n > 1) {
                answer.add(n);
                if (n % 2 == 0) n >>= 1;
                else n = n * 3 + 1;
            }

            answer.add(1);

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
