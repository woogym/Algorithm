package Algorithm.Programers.level1;

// 부족한 금액 계산하기
public class P82612 {
    class Solution {
        public long solution(int price, int money, int count) {

            long usedMoney = (long) price * count * (count + 1) / 2;

            return money >= usedMoney ? 0 : usedMoney - money;
        }
    }
}
