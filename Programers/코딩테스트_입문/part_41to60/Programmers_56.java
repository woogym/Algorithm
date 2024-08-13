package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 외계행성의 나이
public class Programmers_56 {
    class Solution {
        public String solution(int age) {
            StringBuilder answer = new StringBuilder();
            char[] ageDegit = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
            String[] ageStr = String.valueOf(age).split("");

            for (int i = 0; i < ageStr.length; i++) {
                String str = ageStr[i];
                for (int j = 0; j < ageDegit.length; j++) {
                    if (j == Integer.parseInt(str)) {
                        answer.append(ageDegit[j]);
                    }
                }
            }

            return answer.toString();
        }

        public String solution1(int age) {
            String ageStr = Integer.toString(age);
            String result = "";

            // 49를 더하면 해당 해당 알파벳에 해당하는 아스키 코드를 반환한다
            for (int i = 0; i < ageStr.length(); i++) {
                result += (char) (ageStr.charAt(i) + 49);
            }

            return result;
        }
    }
}
