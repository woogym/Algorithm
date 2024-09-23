package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 연속된 수의 합
public class Programmers_94 {
    class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int center = total / num;
            int remainder = total % num;
            int startPoint = center - (num / 2) + (remainder == 0 ? 0 : 1);

            for (int i = 0; i < num; i++) {
                answer[i] = startPoint + i;
            }

            return answer;
        }
    }
}
