package Algorithm.Programers.코딩테스트_입문.part_81to100;

import java.util.Arrays;

// 특이한 정렬
public class Programmers_88 {
    class Solution {
        public int[] solution(int[] numlist, int n) {
            return Arrays.stream(numlist)
                    .boxed()
                    .sorted((a, b) -> {
                        int diffA = Math.abs(n - a);
                        int diffB = Math.abs(n - b);
                        if (diffA == diffB) {
                            return b - a; // 더 큰 수를 우선정렬
                        } else {
                            return diffA - diffB; // 거리를 기준으로 오름차순
                        }
                    })
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
