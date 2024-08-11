package Algorithm.Programers.코딩테스트_입문.part_41to60;

import java.util.ArrayList;
import java.util.List;

public class Programmers_53 {
    class Solution {
        public int[] solution(int n) {
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }

            return list.stream().mapToInt(num -> num).toArray();
        }
    }
}
