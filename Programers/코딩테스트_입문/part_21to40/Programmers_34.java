package Algorithm.Programers.코딩테스트_입문.part_21to40;

import java.util.stream.IntStream;

// n의 배수 고르기
// 첫 스트림으로 알고리즘 풀기 성공!
public class Programmers_34 {
    class Solution {
        public int[] solution(int n, int[] numlist) {
            // of를 통해서 numlist 배열을 stream으로 변환
            // Arrays.stream(numlist)도 가능
            return IntStream.of(numlist)
                    .filter(value -> value % n == 0)
                    .toArray();
        }
    }
}
