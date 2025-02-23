package Algorithm.Programers.level0;

// 배열 만들기
public class P181901 {
    class Solution {
        public int[] solution(int n, int k) {
            int[] answer = new int[n / k];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = k * (i + 1);
            }

            return answer;
        }
    }
}
