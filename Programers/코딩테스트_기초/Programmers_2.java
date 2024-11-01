package Algorithm.Programers.코딩테스트_기초;

// 공배수
public class Programmers_2 {
    class Solution {
        public int solution(int number, int n, int m) {

            if (number % n == 0 && number % m == 0) {
                return 1;
            }

            return 0;
        }
    }
}
