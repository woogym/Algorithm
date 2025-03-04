package Algorithm.Programers.level0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 배열 원소 삭제
public class P181844 {
    class Solution {
        public int[] solution(int[] arr, int[] delete_list) {
            Map<Integer, Boolean> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < delete_list.length; i++) {
                map.put(delete_list[i], true);
            }

            for (int i : arr) {
                if (!map.containsKey(i)) {
                    list.add(i);
                }
            }

            return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
