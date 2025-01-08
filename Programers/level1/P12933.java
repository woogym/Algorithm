package Algorithm.Programers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class P12933 {
    class Solution {
        public long solution(long n) {
            long answer = 0;

            String[] numAry = Long.toString(n).split("");
            Arrays.sort(numAry, Collections.reverseOrder());

            StringBuilder sb = new StringBuilder();

            for (String s : numAry) {
                sb.append(s);
            }

            return Long.parseLong(sb.toString());
        }
    }
}
