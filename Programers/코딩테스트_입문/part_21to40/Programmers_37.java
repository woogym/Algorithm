package Algorithm.Programers.코딩테스트_입문.part_21to40;

// 주사위 개수
public class Programmers_37 {
    class Solution {
        public int solution(int[] box, int n) {
            int answer = 0;

            int height = box[2] / n;
            int weight = (box[0] / n) * (box[1] / n);

            answer = height * weight;

            return answer;
        }
    }
}
