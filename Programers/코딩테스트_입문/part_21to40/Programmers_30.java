package Algorithm.Programers.코딩테스트_입문.part_21to40;

// 숨어있는 숫자의 덧셈(1)
public class Programmers_30 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            String numString = "";

            numString = my_string.replaceAll("[^0-9]", "");
            String[] numArray = numString.split("");

            for (String i : numArray) {
                answer += Integer.parseInt(i);
            }

            return answer;
        }

        public int solution1(String my_string) {

            // 이렇게 하면 문자 1이 아스키코드가 아닌 정수 1로 변형이 된다
            char c = '1';
            int number = c - '0';

            int answer = 0;
            String str = my_string.replaceAll("[^0-9]", "");

            // getNumbericValue를 기억하자 ch - '0' 과 같은 역할을 하지만 메소드를 활용하면 더 좋겠쬬?
            for (char ch : str.toCharArray()) {
                answer += Character.getNumericValue(ch);
            }

            return answer;
        }
    }
}
