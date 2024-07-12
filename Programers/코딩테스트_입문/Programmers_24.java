package Algorithm.Programers.코딩테스트_입문;

// 옷가게 할인 받기
public class Programmers_24 {
    class Solution {
        public int solution(int price) {
            int answer;

            if (price > 499999) {
                answer = (int) (price * 0.8);
            } else if (price > 299999) {
                answer = (int) (price * 0.9);
            } else if (price > 99999) {
                answer = (int) (price * 0.95);
            } else {
                answer = price;
            }

            return answer;
        }
    }
}
