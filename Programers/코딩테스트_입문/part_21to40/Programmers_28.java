package Algorithm.Programers.코딩테스트_입문.part_21to40;

public class Programmers_28 {
    class Solution {
        public int solution(int hp) {
            int answer = 0;

            final int level3 = 5;
            final int level2 = 3;
            final int level1 = 1;

            answer += hp / level3;
            hp %= level3;

            answer += hp / level2;
            hp %= level2;

            answer += hp / level1;

            return answer;
        }

        public int solution1(int hp) {
//               level3 연산 ,level2 연산   ,level1 연산값과 동일
            return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
        }
    }
}
