package Algorithm.Programers.level1;

// 음양 더하기
public class P76501 {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;

            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i]) {
                    answer += absolutes[i];
                } else if (!signs[i]){
                    answer -= absolutes[i];
                }
            }

            return answer;
        }

        public int refactoring(int[] absolutes, boolean[] signs) {
            int answer = 0;

            for (int i = 0; i < absolutes.length; i++) {
                answer += absolutes[i] * (signs[i] ? 1: -1);
            }

            return answer;
        }
    }
}
