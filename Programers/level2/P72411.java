package Algorithm.Programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

// 메뉴 리뉴얼
public class P72411 {
    class Solution {

        static HashMap<String, Integer> map;

        public static void putCombination(String order, StringBuilder sb, int idx, int cnt, int n) {
            if (cnt == n) {
                map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
                return;
            }

            for (int i = idx; i < order.length(); i++) {
                sb.append(order.charAt(i));
                putCombination(order, sb, i + 1, cnt + 1, n);
                sb.delete(cnt, cnt + 1);
            }
        }

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

                    if (course[i] <= orders[j].length()) {
                        putCombination(orders[j], sb, 0, 0, course[i]);
                    }
                }

                for (Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
                    max = Math.max(max, stringIntegerEntry.getValue());
                }

                for (Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
                    if (max >= 2 && stringIntegerEntry.getValue() == max) {
                        answer.add(stringIntegerEntry.getKey());
                    }
                }
            }

            Collections.sort(answer);

            return answer.toArray(String[]::new);
        }
    }
}