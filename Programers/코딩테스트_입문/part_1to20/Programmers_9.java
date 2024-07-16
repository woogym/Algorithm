package Algorithm.Programers.코딩테스트_입문.part_1to20;

public class Programmers_9 {

    class Solution {
        public int solution(int angle) {
            int result = 0;

            if (angle < 90) {
                result = 1;
            } else if (angle == 90) {
                result = 2;
            } else if (angle < 180) {
                result = 3;
            } else if (angle == 180) {
                result = 4;
            }

            return result;
        }
    }
}
