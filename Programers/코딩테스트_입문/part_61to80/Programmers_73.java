package Algorithm.Programers.코딩테스트_입문.part_61to80;

import java.util.ArrayList;
import java.util.List;

// 잘라서 배열로 저장하기
public class Programmers_73 {
    class Solution {
        public String[] solution(String my_str, int n) {
            List<String> list = new ArrayList<>();

            for (int i = 0; i < my_str.length(); i+=n) {
                list.add(my_str.substring(i, Math.min(i + n, my_str.length()))); // 나머지 문자열에 대한 처리
            }

            return list.toArray(new String[0]);
        }
    }
}
