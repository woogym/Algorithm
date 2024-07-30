package Algorithm.Programers.코딩테스트_입문.part_21to40;

import java.util.Arrays;

public class Programmers_40 {
    class Solution {
        public int solution(int[] sides) {
            int answer;

            int[] sortedAry = Arrays.stream(sides).sorted().toArray();

            if (sortedAry[0] + sortedAry[1] > sortedAry[2]) {
                answer = 1;
            } else {
                answer = 2;
            }

            return answer;
        }
    }
}
