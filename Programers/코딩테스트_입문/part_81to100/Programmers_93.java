package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 다음에 올 숫자 (등차수열 or 등비수열)
public class Programmers_93 {
    class Solution {
        public int solution(int[] common) {
            int answer;

            if ((common[1] - common[0]) == (common[2] - common[1])) {
                answer = common[common.length - 1] + (common[1] - common[0]);
            } else {
                answer = common[common.length - 1] * (common[1] / common[0]);
            }

            return answer;
        }
    }
}
