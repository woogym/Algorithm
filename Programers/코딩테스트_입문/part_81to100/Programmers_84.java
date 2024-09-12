package Algorithm.Programers.코딩테스트_입문.part_81to100;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 등수 매기기
public class Programmers_84 {
    class Solution {
        public int[] solution(int[][] score) {
            int[] answer = new int[score.length];
            double[] average = new double[score.length];
            double decider = Double.MAX_VALUE;

            for (int i = 0; i < score.length; i++) {
                double avg = (double) (score[i][0] + score[i][1]) / 2;
                average[i] = avg;
            }

            for (int j = 0; j < score.length; j++) {
                int num = 1;
                for (int k = 0; k < score.length; k++) {
                    if (average[j] < average[k]) {
                        num++;
                    }

                    answer[j] = num;
                }
            }

            return answer;
        }

        // 또다른 풀이
        public int[] solution1(int[][] score) {
            List<Integer> scoreList = new ArrayList<>();

            for (int[] t : score) {
                scoreList.add(t[0] + t[1]);
            }

            // 합산한 점수 내림차순으로 정렬
            // 내림차순으로 정렬한 인덱스 위치가 곧 순위가 되는 데이터가 됨
            scoreList.sort(Comparator.reverseOrder());

            int[] answer = new int[score.length];
            for (int i = 0; i < score.length; i++) {
                // indexOf를 통한 제일 작은 index로 첫번째 위치부터 구현
                // scoreList의 합산한 점수의 인덱스를 찾고 순위는 1등부터니 + 1 연산을 진행해준다.
                // 내림차순으로 순위를 정렬하고 해당 점수의 인덱스와 동일한 answer배열에 순위 정보를 등록한다.
                answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
            }

            return answer;
        }
    }
}
