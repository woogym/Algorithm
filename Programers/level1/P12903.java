package Algorithm.Programers.level1;

// 가운데 글자 가져오기
public class P12903 {
    class Solution {
        public String solution(String s) {
            int middleElement = s.length() / 2;

            if (s.length() % 2 == 0) {
                return s.substring(middleElement - 1, middleElement + 1);
            }

            return String.valueOf(s.charAt(middleElement));
        }
    }
}
