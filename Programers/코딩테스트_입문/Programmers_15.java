package Algorithm.Programers.코딩테스트_입문;

import java.util.Arrays;

public class Programmers_15 {
    class Solution {
        public int[] solution1(int[] num_list) {
            int[] answer = new int[2];

            for (int i = 0; i < num_list.length + 1; i++) {
                if (num_list[i] % 2 == 0) {
                    answer[0]++;
                } else {
                    answer[1]++;
                }
            }

            return answer;
        }
    }
}
