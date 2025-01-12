package Algorithm.Programers.level1;

import java.util.Arrays;

public class P12919 {
    class Solution {
        public String solution(String[] seoul) {
            int kimLocate = 0;

            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    kimLocate = i;
                }
            }

            return "김서방은 " + kimLocate + "에 있다";
        }

        public String recfactoring(String[] seoul) {
            int locate = Arrays.asList(seoul).indexOf("Kim");

            return "김서방은 " + locate + "에 있다";
        }
    }
}
