package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 겹치는 선분의 길이
public class Programmers_97 {
    class Solution {
        public int solution(int[][] lines) {
            int answer = 0;
            int[] rail = new int[200];

            for (int[] line : lines) {
                for (int i = (line[0] + 100); i < (line[1] + 100); i++) {
                    rail[i]++;
                }
            }

            for (int i : rail) {
                if (i > 1) {
                    answer++;
                }
            }

            return answer;
        }
    }
}
