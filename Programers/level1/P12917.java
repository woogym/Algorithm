package Algorithm.Programers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;

// 문자열 내리차순으로 배치하기
public class P12917 {
    class Solution {
        public String solution(String s) {
            return s.chars()
                    .mapToObj(c -> (char) c)
                    .sorted((a, b) -> Character.compare(b, a))
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        }
    }
}
