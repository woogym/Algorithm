package Algorithm.Programers.코딩테스트_입문.part_61to80;

import java.util.ArrayList;
import java.util.List;

// 소인수 분해
public class Programmers_71 {
    class Solution {
        public int[] solution(int n) {
            List<Integer> list = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }

                    list.add(i);
                }
            }

            return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
