package Algorithm.Programers.코딩테스트_입문.part_21to40;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 인덱스 바꾸기
public class Programmers_36 {
    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";
            String[] parameter_ary = my_string.split("");

            String index1 = parameter_ary[num1];
            String index2 = parameter_ary[num2];

            parameter_ary[num1] = index2;
            parameter_ary[num2] = index1;

            answer = String.join("", parameter_ary);

            return answer;
        }

        public String solution1(String my_string, int num1, int num2) {
            String answer = "";

            char[] ch = my_string.toCharArray();

            ch[num1] = my_string.charAt(num2);
            ch[num2] = my_string.charAt(num1);

            // String.join은 안하고 char로 처리할 수 있는 방법이 있었다..
            answer = String.valueOf(ch);

            return answer;
        }

        public String solution2(String my_string, int num1, int num2) {
            List<String> list = Arrays.stream(my_string.split(""))
                    .collect(Collectors.toList());

            // Collections에 다양한 기능들이 있다 참고해보자!
            Collections.swap(list, num1, num2);
            return String.join("", list);
        }
    }
}
