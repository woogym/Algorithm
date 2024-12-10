package Algorithm.Programers.level1;

public class Programmers_9 {
    class Solution {
        boolean solution(String s) {
            int pCount = 0;
            int yCount = 0;
            String str = s.toLowerCase().trim();

            for (int i = 0; i < str.length(); i++) {
                char index = str.charAt(i);

                if (index == 'p') {
                    pCount++;
                }

                if (index == 'y') {
                    yCount++;
                }
            }

            return pCount == yCount;
        }
    }
}
