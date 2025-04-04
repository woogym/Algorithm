package Algorithm.Programers.level1;

// 숫자 문자열과 영단어
public class P81301 {
    class Solution {
        public int solution(String s) {
            return Integer.parseInt(numericParser(s));
        }

        private String numericParser(String number) {
            String num = number;

            if (number.contains("one")) num = num.replaceAll("one", "1");
            if (number.contains("two")) num = num.replaceAll("two", "2");
            if (number.contains("three")) num = num.replaceAll("three", "3");
            if (number.contains("four")) num = num .replaceAll("four", "4");
            if (number.contains("five")) num = num.replaceAll("five", "5");
            if (number.contains("six")) num = num.replaceAll("six", "6");
            if (number.contains("seven")) num = num.replaceAll("seven", "7");
            if (number.contains("eight")) num = num.replaceAll("eight", "8");
            if (number.contains("nine")) num = num.replaceAll("nine", "9");
            if (number.contains("zero")) num = num.replaceAll("zero", "0");

            return num;
        }
    }
}
