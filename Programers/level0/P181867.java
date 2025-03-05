package Algorithm.Programers.level0;

import java.util.ArrayList;
import java.util.List;

public class P181867 {
    class Solution {
        public int[] solution(String myString) {
            List<Integer> answer = new ArrayList<>();
            int num = 0;
            int beforeLocate = 0;

            for (int i = 0; i < myString.length(); i++) {
                int locate = myString.indexOf("x", num);
                answer.add(locate - beforeLocate);
                num += locate;
                beforeLocate = locate;
            }

            return answer.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
