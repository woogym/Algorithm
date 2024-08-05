package Algorithm.Programers.코딩테스트_입문.part_41to60;

// 제곱수 판별하기
public class Programmers_47 {
    class Solution {
        public int solution(int n) {

            if (Math.sqrt(n) % 1 == 0) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
