package Algorithm.Programers.코딩테스트_입문.part_1to20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programmers_18 {
    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;

            for (int num : array) {
                if (num == n) {
                    answer++;
                }
            }

            return answer;
        }

        // stream 사용에 익숙해지기
        public int solution1(int[] array, int n) {
            return (int) Arrays.stream(array).filter(i -> i == n).count();
        }
    }
}
