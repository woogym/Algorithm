package Algorithm.Programers.코딩테스트_입문.part_61to80;

// k의 개수
public class Programmers_61 {
    class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;

            for (int l = i; l <= j; l++) {
                String numStr = String.valueOf(l);
                for (int m = 0; m < numStr.length(); m++) {
                    if (String.valueOf(numStr.charAt(m)).equals(String.valueOf(k))) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}
