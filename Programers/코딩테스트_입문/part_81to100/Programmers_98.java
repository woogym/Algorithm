package Algorithm.Programers.코딩테스트_입문.part_81to100;


// 평행
public class Programmers_98 {
    class Solution {
        public int solution(int[][] dots) {
            int answer = 0;
            int x1 = dots[0][0];
            int y1 = dots[0][1];
            int x2 = dots[1][0];
            int y2 = dots[1][1];
            int x3 = dots[2][0];
            int y3 = dots[2][1];
            int x4 = dots[3][0];
            int y4 = dots[3][1];

            double slope1 = (double) (y2 - y1) / (x2 - x1);
            double slope2 = (double) (y4 - y3) / (x4 - x3);
            if (decide(slope1, slope2)) {
                return 1;
            }

            slope1 = (double) (y3 - y1) / (x3 - x1);
            slope2 = (double) (y2 - y4) / (x2 - x4);
            if (decide(slope1, slope2)) {
                return 1;
            }

            slope1 = (double) (y4 - y1) / (x4 - x1);
            slope2 = (double) (y2 - y3) / (x2 - x3);
            if (decide(slope1, slope2)) {
                return 1;
            }

            return 0;
        }

        private boolean decide(double num1, double num2) {
            return num1 == num2;
        }
    }
}
