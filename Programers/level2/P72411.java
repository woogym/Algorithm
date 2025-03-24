package Algorithm.Programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 메뉴 리뉴얼
public class P72411 {
    class Solution {

        static HashMap<String, Integer> map;

        public String[] solution(String[] orders, int[] course) {
            List<String> answer = new ArrayList<>();

            for (int i = 0; i < orders.length; i++) {
                char[] chars = orders[i].toCharArray();
                Arrays.sort(chars);
                orders[i] = String.valueOf(chars);
            }

            for (int i = 0; i < course.length; i++) {
                map = new HashMap<>();
                int max = Integer.MIN_VALUE;

                for (int j = 0; j < orders.length; j++) {
                    StringBuilder sb = new StringBuilder();

                    if (course[i] <= orders[i].length()) {
                        putCombination(orders[j], sb, 0, 0, course[i]);
                    }
                }
            }

            return answer.stream()
                    .sorted()
                    .toArray(String[]::new);
        }

    }
}
