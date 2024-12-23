package Algorithm.Programers.level0;

import java.util.ArrayList;
import java.util.List;

// 5명씩
public class Programmers_12 {
    class Solution {
        public String[] solution(String[] names) {
            String[] answer = new String[(names.length + 4) / 5];
            int index = 0;

            for (int i = 0; i < answer.length; i++) {
                answer[i] = names[index];
                index += 5;
            }

            return answer;
        }

        public String[] solution2(String[] names) {
            List<String> answer = new ArrayList<>();

            for (int i = 0; i * 5 < names.length; i++) {
                answer.add(names[i * 5]);
            }

            return answer.toArray(new String[0]);
        }
    }
}
