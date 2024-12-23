package Algorithm.Programers.level0;

import java.util.ArrayList;
import java.util.List;

// 약수의 합
public class Programmers_1 {
    class Solution {
        public int solution(int n) {
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }

            return list.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }
    }
}
