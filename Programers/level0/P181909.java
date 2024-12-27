package Algorithm.Programers.level0;

import java.util.ArrayList;
import java.util.List;

// 접미사 배열
public class P181909 {
    class Solution {
        public String[] solution(String my_string) {
            List<String> answer = new ArrayList<>();

            for (int i = 0; i < my_string.length(); i++) {
                answer.add(my_string.substring(i));
            }

            return answer.stream()
                    .sorted()
                    .toArray(String[]::new);
        }
    }
}
