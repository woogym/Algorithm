package Algorithm.Programers.코딩테스트_입문.part_1to20;

// 양꼬치
public class Programmers_12 {
    class Solution {
        public int solution(int n, int k) {
            final int yangCcochiPrice = 12000;
            final int drinkPrice = 2000;

            int saleCount = n / 10;
            int salePrice = 0;
            int answer;

            if (saleCount >= 1) {
                salePrice = saleCount * drinkPrice;
            }

            answer = (yangCcochiPrice * n) + (drinkPrice * k) - salePrice;

            return answer;
        }
    }
}
