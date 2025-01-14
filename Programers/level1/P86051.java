package Algorithm.Programers.level1;

// 없는 숫자 더하기
public class P86051 {
    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;

            for (int number : numbers) {
                answer += number;
            }

            return 45 - answer;
        }
    }
}
