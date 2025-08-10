package Algorithm.Programers.level1;

import java.util.HashMap;

// 완주하지 못한 선수
public class P42576 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> map = new HashMap<>();

            for (String s : participant) {
                map.put(s, 1 + map.getOrDefault(s, 0));
            }

            for (String s : completion) {
                map.put(s, map.get(s) - 1);

                if (map.get(s) == 0) {
                    map.remove(s);
                }
            }

            return map.keySet().iterator().next();
        }
    }
}
