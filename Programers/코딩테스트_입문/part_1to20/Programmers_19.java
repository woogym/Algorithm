package Algorithm.Programers.코딩테스트_입문.part_1to20;

public class Programmers_19 {
    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;

            for (int num : array) {
                if (num > n) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
