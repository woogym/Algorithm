package Algorithm.Programers.level1;

public class P12945 {
    class Solution {
        public String solution(String phone_number) {

            String start_Index = phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*");
            String end_Index = phone_number.substring(phone_number.length() - 4);

            return start_Index.concat(end_Index);
        }

        public String refactoring1(String phone_number) {
            char[] ch = phone_number.toCharArray();

            for (int i = 0; i < ch.length - 4; i++) {
                ch[i] = '*';
            }

            return String.valueOf(ch);
        }

        public String refactoring2(String phone_number) {
            // . -> [임의의 문자 한 개] / (?=.) -> 뒷쪽에 임의의 문자 한 개를 제외하고 선택 / {숫자} -> 숫자 만큼의 자릿수
            // ".(?=.{4})" -> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
            return phone_number.replaceAll(".(?=.{4})", "*");
        }
    }
}
