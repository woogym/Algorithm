package Algorithm.Programers.level0;

import java.util.Arrays;

// 평균 구하기
public class Programmers_4 {
    class Solution {
        public double solution(int[] arr) {
            int num = 0;

            for (int i : arr) {
                num += i;
            }

            return (double) num / arr.length;
        }

        // 존나 오래 걸리는 풀이..
        public double solution1(int[] arr) {
            return (double) Arrays.stream(arr).sum() / arr.length;
        }
    }
}
