package Algorithm.Programers.코딩테스트_입문.part_81to100;

// 치킨 쿠폰
public class Programmers_85 {
    class Solution {
        public int solution(int chicken) {
            int service = 0;

            while (chicken >= 10) {
                service += chicken / 10;
                chicken = (chicken / 10) + (chicken % 10);
            }

            return service;
        }
    }
}
