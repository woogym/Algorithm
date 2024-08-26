package Algorithm.Programers.코딩테스트_입문.part_61to80;

// 가까운 수 찾기
public class Programmers_67 {
    class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            int diff = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < array.length; i++) {
                diff = Math.abs(n - array[i]);
                if (diff < min) {
                    min = diff;
                    answer = array[i];

                } else if (diff == min && array[i] < answer) {
                    answer = array[i];
                }
            }
            return answer;
        }
    }
}
