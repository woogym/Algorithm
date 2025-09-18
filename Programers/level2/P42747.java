package Algorithm.Programers.level2;

import java.util.Arrays;

// H-Index
public class P42747 {
    class Solution {
        public int solution(int[] citations) {
            int answer = 0;
            Arrays.sort(citations);

            for (int i = 0; i < citations.length; i++) {

                // 남은 논문의 갯수
                int h = citations.length - i;

                if (citations[i] >= h) {
                    answer = h;
                    break;
                }
            }

            return answer;
        }
    }
}
