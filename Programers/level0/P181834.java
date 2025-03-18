package Algorithm.Programers.level0;

public class P181834 {
    class Solution {
        public String solution(String myString) {
            StringBuilder answer = new StringBuilder();
            int standard = 108;

            for (int i = 0; i < myString.length(); i++) {
                if (myString.charAt(i) < 108) {
                    answer.append("l");
                } else {
                    answer.append(myString.charAt(i));
                }
            }

            return answer.toString();
        }

        public String refactoring(String myString) {
            return myString.replaceAll("[a-k]", "l");
        }
    }
}
