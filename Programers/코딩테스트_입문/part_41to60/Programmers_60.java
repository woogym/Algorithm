package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 2차원으로 만들기
public class Programmers_60 {
    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];
            int count = 0;

            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[i].length; j++, count++) {
                    answer[i][j] = num_list[count];
                }
            }

            return answer;
        }
    }
}
