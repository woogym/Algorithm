package Algorithm.Programers.코딩테스트_입문.part_1to20;

// 세균 증식
public class Programmers_21 {
    class Solution {
        public int solution(int n, int t) {
            int answer = n;

            for (int i = 0; i < t; i++) {
                answer = answer * 2;
            }

            return answer;
        }

        // 비트 연산자를 활용한 풀이
        public int solution1(int n, int t) {
            int answer = 0;

            // 비트 연산자를 활용하기! n의 2진 비트들을 t번만큼 쉬프트 해서 계산
            answer = n << t;

            return answer;
        }
    }
}
