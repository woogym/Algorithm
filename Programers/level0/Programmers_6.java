package Algorithm.Programers.level0;

// 나머지가 1이 되는 수 찾기
public class Programmers_6 {
    class Solution {
        public int solution(int n) {

            for (int i = 2; i <= n; i++) {
                if ((n - 1) % i == 0) {
                    return i;
                }
            }

            return n - 1;
        }
    }
}
