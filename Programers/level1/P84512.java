package Algorithm.Programers.level1;

import java.util.ArrayList;
import java.util.Map;

// 모음 사전
public class P84512 {
    class Solution {

        private final char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        private ArrayList<String> list;

        public int solution(String word) {
            int count = 0;
            list = new ArrayList<>();
            dfs("");

            for (int i = 1; i < list.size(); i++) {

                if (list.get(i).equals(word)) {
                    count = i;
                    break;
                }
            }

            return count;
        }

        private void dfs(String result) {
            list.add(result);

            if (result.length() == 5) {
                return;
            }

            for (int i = 0; i < vowels.length; i++) {
                dfs(result + vowels[i]);
            }
        }

        // 수학적 가중치 풀이법 - 복습하기
        public int solution1(String word) {
            // 각 자리별 가중치 계산
            int[] weight = new int[5];
            for (int i = 0; i < 5; i++) {
                int w = 0;
                for (int j = 0; j < 5 - i; j++) {
                    w += (int) Math.pow(5, j);
                }
                weight[i] = w;
            }

            Map<Character, Integer> idx = Map.of('A', 0, 'E', 1, 'I', 2, 'O', 3, 'U', 4);

            int answer = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int order = idx.get(c);

                answer += order * weight[i] + 1;
            }

            return answer;
        }
    }
}
