package Algorithm.Programers.level0;

public class P181939 {
    class Solution {
        public int solution(int a, int b) {
            int num1 = Integer.parseInt(a + "" + b);
            int num2 = Integer.parseInt(b + "" + a);

            return Math.max(num1, num2);
        }
    }
}
