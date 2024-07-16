package Algorithm.Programers.코딩테스트_입문.part_1to20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 배열 뒤집기
public class Programmers_13 {
    class Solution {

        public int[] solution(int[] num_list) {
            int[] reverse = new int[num_list.length];

            for (int i = 0; i <= num_list.length - 1; i++) {
                reverse[i] = num_list[num_list.length - 1 - i];
            }

            return reverse;
        }

        public int[] solution2(int[] num_list) {
            int[] answer;

            // num_list를 stream으로 변환
            // stream을 boxed를 통해서 각 요소들을 integer로 박싱(기본형 int를 참조형 Integer로 변환)
            // list로 변환
            List<Integer> list;
            list = Arrays.stream(num_list)
                    .boxed()
                    .collect(Collectors.toList());

            // Collections를 이용해서 list 뒤집기
            Collections.reverse(list);

            // list를 다시 기본형 int로 변환후 배열로 전환
            answer = list.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }
}
