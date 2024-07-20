package Algorithm.Programers.코딩테스트_입문.part_21to40;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Programmers_31 {
    class Solution {
        public String solution(String cipher, int code) {
            StringBuilder answer = new StringBuilder();

            // 실제 문자열 길이를 올바르게 책정하기 위해서 ciper.length() + 1
            // code의 배수부터 문자열을 책정하기에 i는 1부터 시작
            for (int i = 1; i < cipher.length() + 1; i++) {

                // code의 배수 위치마다 있는 문자열을 계산할때 문자열의 인덱스를 초과해서 책정되는것을 방지하기 위한 조건문
                if (cipher.length() < (i * code - 1)) {
                    break;
                }

                // i * code - 1 -> 우리가 눈으로 보는 문자열 ciper와 String에서의 문자열 index 번호와의 차이를 계산하기 위한 -1
                // code가 4라면 처음 문자열의 인덱스 위치는 실제로 3이기 때문에
                answer.append(cipher.charAt(i * code - 1));
            }

            return answer.toString();
        }

        public String solution2(String ciper, int code) {
            String answer = "";

            for (int i = code - 1; i < ciper.length(); i += code) {
                answer += ciper.charAt(i);
            }

            return answer;
        }

        public String solution3(String ciper, int code) {
            String answer = "";

            for (int i = code; i <= ciper.length(); i += code) {
                answer += ciper.substring(i - 1, i);
            }

            return answer;
        }

        public String solution4(String ciper, int code) {
            return IntStream.range(0, ciper.length())
                    // 0 ~ ciper.length() 를 순회할때 value 를 code로 나눴을때의 나머지 값이 code - 1 값이 까지의 정수만 통과시킨다
                    // 이는 ciper.length()의 바로 직전값이 될 것이다 -> 이것은 실제 문자열 index에서 code의 배수 위치에 맞는 문자열들만 필터링한다는 (code - 1) 이 부분이 그러하다
                    .filter(value -> value % code == code - 1)
                    .mapToObj(c -> String.valueOf(ciper.charAt(c)))
                    .collect(Collectors.joining());
        }
    }
}
