package Algorithm.Programers.코딩테스트_입문.part_21to40;

import java.util.stream.IntStream;

// 순서쌍의 개수
public class Programmers_27 {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                if ((n % i) == 0) {
                    answer++;
                }
            }

            return answer;
        }

        public int solution1(int n) {
            return (int) IntStream.rangeClosed(1,n).filter(i -> n % i == 0).count();
        }
    }
}
