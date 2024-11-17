package Algorithm.Programers.코딩테스트_기초;

import java.util.Arrays;

public class Programmers_7 {
    class Solution {
        public int[] solution(int[] num_list) {
            return Arrays.stream(num_list)
                    .sorted()
                    .limit(5)
                    .toArray();
        }
    }
}
