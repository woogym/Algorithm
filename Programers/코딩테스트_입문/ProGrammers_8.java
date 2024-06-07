package Algorithm.Programers.코딩테스트_입문;

import java.util.Arrays;

public class ProGrammers_8 {
    class Solution {
        public double solution(int[] numbers) {
            double answer;
            double all = 0;
            int arySize = numbers.length;

            for (int i = 0; i < arySize; i++) {
                all += numbers[i];
            }

            answer = all / arySize;

            return answer;
        }
    }
}
