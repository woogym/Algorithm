package Algorithm.Programers.코딩테스트_입문.part_41to60;

import java.util.Arrays;

// 문자 정렬하기(2)
public class Programmers_55 {
    class Solution {
        public String solution(String my_string) {
            char[] c = my_string.toLowerCase().toCharArray();
            Arrays.sort(c);

            // c char 배열을 String 생성자의 인자로 넣어서 문자열로 반환
            return new String(c);
        }
    }
}
