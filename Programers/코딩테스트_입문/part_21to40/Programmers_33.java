package Algorithm.Programers.코딩테스트_입문.part_21to40;

// 가장 큰 수 찾기
public class Programmers_33 {
    class Solution {
        public int[] solution(int[] array) {
            int[] answer = new int[2];
            int big = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > answer[0]) {
                    answer[0] = array[i];
                    answer[1] = i;
                }
            }

            return answer;
        }
    }
}
