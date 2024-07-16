package Algorithm.Programers.코딩테스트_입문.part_21to40;

public class Programmers_25 {
    class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];
            final int americano = 5500;

            answer[0] = money / americano;
            answer[1] = money % americano;

            return answer;
        }
    }
}
