package Algorithm.Programers.코딩테스트_입문.part_21to40;

import java.util.Arrays;

public class Programmers_21 {
    class Solution {
        public int solution(int[] array) {
            int[] ary = Arrays.stream(array).sorted().toArray();

            return ary[(ary.length / 2) + 1];
        }
    }
}
