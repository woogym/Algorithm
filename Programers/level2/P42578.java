package Algorithm.Programers.level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// 의상
/*
1 - 얼굴
2 - 상의
3 - 하의
4 - 겉옷
*/
public class P42578 {
    class Solution {
        public int solution(String[][] clothes) {
            Map<String, Integer> map = new HashMap<>();
            int count = 1;

            for (String[] clothe : clothes) {
                String type = clothe[1];
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            for (int i : map.values()) {
                count *= (i + 1);
            }

            return count - 1;
        }
    }

    public static void main(String[] args) {
        String[][] clothes = {
                {"yellowhat", "headgear"},
                {"bluesunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        P42578 p42578 = new P42578();
        P42578.Solution solution = p42578.new Solution();
        int result = solution.solution(clothes);

        System.out.println(result);
    }
}

